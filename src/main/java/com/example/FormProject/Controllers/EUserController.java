package com.example.FormProject.Controllers;

import com.example.FormProject.Model.EUser;
import com.example.FormProject.Services.euser.EUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class EUserController {

    @Autowired
    private EUserService userService;

    @PostMapping("/signup")
    public ResponseEntity<EUser> signUp(@RequestBody EUser user) {
        EUser createdUser = userService.signUp(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<EUser> login(@RequestBody EUser loginRequest) {
        EUser user = userService.login(loginRequest.getEmail(), loginRequest.getPassword());
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK)
                            : new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
