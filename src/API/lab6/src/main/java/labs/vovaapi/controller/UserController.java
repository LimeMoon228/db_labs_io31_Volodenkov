package labs.vovaapi.controller;

import labs.vovaapi.dto.UserDto;
import labs.vovaapi.entity.User;
import labs.vovaapi.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/users")
    public ResponseEntity<User> save(@RequestBody UserDto dto){
        User user = userService.save(dto);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateById(@PathVariable("id") Long id, @RequestBody UserDto dto){
        User user = userService.updateById(dto, id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.deleteById(id));
    }
}
