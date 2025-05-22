package labs.vovaapi.service.user;

import labs.vovaapi.dto.UserDto;
import labs.vovaapi.entity.User;
import labs.vovaapi.mapper.UserMapper;
import labs.vovaapi.repository.RoleRepository;
import labs.vovaapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        if (id == null){
            throw new IllegalArgumentException("Id is not provided!");
        };
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(UserDto dto) {
        if (dto == null){
            throw new IllegalArgumentException("data is not provided!");
        }
        User user = UserMapper.toEntity(dto, roleRepository);
        return userRepository.save(user);
    }

    @Override
    public User updateById(UserDto dto, Long id) {
        if (id == null || dto == null){
            throw new IllegalArgumentException("Data or id is not provided!");
        }
        if (userRepository.existsById(id)){
            User user = UserMapper.toEntity(dto, roleRepository);
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (id == null){
            throw new IllegalArgumentException("Id is not provided!");
        };
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
