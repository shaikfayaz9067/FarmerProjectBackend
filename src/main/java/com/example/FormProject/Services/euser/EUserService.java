package com.example.FormProject.Services.euser;

import com.example.FormProject.Model.EUser;
import com.example.FormProject.Repository.EUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EUserService {

    @Autowired
    private EUserRepository userRepository;

    public EUser signUp(EUser user) {
        return userRepository.save(user);
    }

    public EUser login(String username, String password) {
        EUser user = userRepository.findByUsername(username); // Fetch user by username
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;  // Return null if username or password is incorrect
    }
}
