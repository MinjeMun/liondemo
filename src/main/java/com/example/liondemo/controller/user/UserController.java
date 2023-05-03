package com.example.liondemo.controller.user;

import com.example.liondemo.dto.request.UserCreateRequest;
import com.example.liondemo.dto.request.UserUpdateRequest;
import com.example.liondemo.dto.response.UserResponse;
import com.example.liondemo.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }
    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
        userService.deleteUser(name);
    }
    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUsers();
    }
    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userService.updateUser(request);
    }

}

