package io.ducozil1003.store.controller;

import io.ducozil1003.store.domain.User;
import io.ducozil1003.store.repository.UserRepository;
import io.ducozil1003.store.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }
    @PostMapping("/Sign-up")
    public String SignUp(@RequestBody User user) {
        this.userService.handleSaveUser(user);
        return "Success";
    }
    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> findAllUser() {
       return ResponseEntity.ok(this.userService.getAllUsers());

    }
    @GetMapping("/getUserById")
    public ResponseEntity<User> findAllUser(@RequestParam long id) {
        return ResponseEntity.ok(this.userService.getDetailsUser(id));
    }
    @PostMapping("/updateUserById")
    public ResponseEntity<String> updateUser(@RequestBody User user, @RequestParam long id) {
        User currentUser =  this.userService.getDetailsUser(id);
        if(currentUser == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        currentUser.setAddress(user.getAddress() != null ? user.getAddress() : currentUser.getAddress());
        currentUser.setEmail(user.getEmail() != null ? user.getEmail() : currentUser.getEmail());
        currentUser.setPassword(user.getPassword() != null ? user.getPassword() : currentUser.getPassword());
        currentUser.setPhone(user.getPhone() != null ? user.getPhone() : currentUser.getPhone());
        currentUser.setFullName(user.getFullName() != null ? user.getFullName() : currentUser.getFullName());
        this.userService.handleSaveUser(currentUser);
        return ResponseEntity.ok("Success");
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam long id) {
        User currentUser =  this.userService.getDetailsUser(id);
        if(currentUser == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        return ResponseEntity.ok("Success");
    }
}
