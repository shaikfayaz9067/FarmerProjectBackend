package com.example.FormProject.Services.user;

import com.example.FormProject.Model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    User updateUser(String id, User user);

    void deleteUser(String id);

    List<User> getUsersByRole(String role);
}
