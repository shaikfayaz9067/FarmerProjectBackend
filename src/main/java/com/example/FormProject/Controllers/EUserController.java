package com.example.FormProject.Controllers;

import com.example.FormProject.Model.EUser;
import com.example.FormProject.Services.euser.EUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eusers")
@CrossOrigin({"http://localhost:4200", "http://localhost:5000", "http://localhost:3000"})
public class EUserController {

    @Autowired
    private EUserService userService;

    @PostMapping("/signup")
    public ResponseEntity<EUser> signUp(@RequestBody EUser user) {
        EUser createdUser = userService.signUp(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/login/{username}")
    public ResponseEntity<EUser> login(@PathVariable String username, @RequestParam String password) {
        EUser user = userService.login(username, password);  // Check username and password
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK)
                            : new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
