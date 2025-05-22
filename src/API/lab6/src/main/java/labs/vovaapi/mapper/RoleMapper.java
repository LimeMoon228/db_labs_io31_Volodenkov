package labs.vovaapi.mapper;

import labs.vovaapi.dto.RoleDto;
import labs.vovaapi.entity.Role;

public class RoleMapper {

    public static Role toEntity(RoleDto dto){
        Role role = new Role();

        role.setStatus(dto.status());
        role.setDescription(dto.description());

        return role;
    }
}
