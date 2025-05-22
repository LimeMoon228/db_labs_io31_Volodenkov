package labs.vovaapi.controller;

import labs.vovaapi.dto.RoleDto;
import labs.vovaapi.dto.UserDto;
import labs.vovaapi.entity.Role;
import labs.vovaapi.entity.User;
import labs.vovaapi.service.role.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> findAll(){
        List<Role> roles = roleService.findAll();
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/roles/{id}")
    public ResponseEntity<Role> findById(@PathVariable("id") Long id){
        Role role = roleService.findById(id);
        return ResponseEntity.ok(role);
    }

    @PostMapping("/roles")
    public ResponseEntity<Role> save(@RequestBody RoleDto dto){
        Role role = roleService.save(dto);
        return ResponseEntity.ok(role);
    }

    @PutMapping("/roles/{id}")
    public ResponseEntity<Role> updateById(@PathVariable("id") Long id, @RequestBody RoleDto dto){
        Role role = roleService.updateById(dto, id);
        return ResponseEntity.ok(role);
    }

    @DeleteMapping("/roles/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(roleService.deleteById(id));
    }
}
