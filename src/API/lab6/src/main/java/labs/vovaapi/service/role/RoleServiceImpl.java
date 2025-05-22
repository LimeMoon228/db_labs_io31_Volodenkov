package labs.vovaapi.service.role;

import labs.vovaapi.dto.RoleDto;
import labs.vovaapi.entity.Role;
import labs.vovaapi.mapper.RoleMapper;
import labs.vovaapi.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        if (id == null){
            throw new IllegalArgumentException("Id is not provided!");
        };
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role save(RoleDto dto) {
        if (dto == null){
            throw new IllegalArgumentException("data is not provided!");
        }
        Role role = RoleMapper.toEntity(dto);
        return roleRepository.save(role);
    }

    @Override
    public Role updateById(RoleDto dto, Long id) {
        if (id == null || dto == null){
            throw new IllegalArgumentException("Data or id is not provided!");
        }
        if (roleRepository.existsById(id)){
            Role role = RoleMapper.toEntity(dto);
            role.setId(id);
            return roleRepository.save(role);
        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (id == null){
            throw new IllegalArgumentException("Id is not provided!");
        };
        if (roleRepository.existsById(id)){
            roleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
