package labs.vovaapi.dto;

public record UserDto(
        String firstName,
        String lastName,
        int age,
        String email,
        String password,
        String phoneNumber,
        Long roleId
) {
}
