package com.example.FormProject.Controllers;

import com.example.FormProject.Model.User;
import com.example.FormProject.Services.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin({ "http://localhost:4200", "http://localhost:5000", "http://localhost:3000" })
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(u -> new ResponseEntity<>(u, HttpStatus.OK))
                   .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return updatedUser != null ? new ResponseEntity<>(updatedUser, HttpStatus.OK)
                                   : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

      @GetMapping("/role/{role}")
    public ResponseEntity<List<User>> getUsersByRoleGet(@PathVariable String role) {
        List<User> usersByRole = userService.getUsersByRole(role);
        return new ResponseEntity<>(usersByRole, HttpStatus.OK);
    }

    // POST mapping to get users by role from the request body
//     @PostMapping("/role")
//     public ResponseEntity<List<User>> createtUsersByRole(@RequestBody String role) {
//         List<User> usersByRole = userService.getUsersByRole(role);
//         return new ResponseEntity<>(usersByRole, HttpStatus.OK);
//     }
}
