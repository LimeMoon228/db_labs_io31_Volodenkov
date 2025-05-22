package labs.vovaapi.mapper;

import labs.vovaapi.dto.UserDto;
import labs.vovaapi.entity.User;
import labs.vovaapi.repository.RoleRepository;

public class UserMapper {

    public static User toEntity(UserDto dto, RoleRepository repository){
        User user = new User();

        user.setFirstName(dto.firstName());
        user.setLastName(dto.lastName());
        user.setAge(dto.age());
        user.setEmail(dto.email());
        user.setPassword(dto.password());
        user.setPhoneNumber(dto.phoneNumber());
        user.setRole(repository.findById(dto.roleId()).orElse(null));

        return user;
    }

}
