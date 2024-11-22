package io.ducozil1003.store.controller;

import io.ducozil1003.store.model.User;
import io.ducozil1003.store.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/Sign-up")
    public String SignUp(@RequestBody User user) {
        return user.toString();
    }
}
