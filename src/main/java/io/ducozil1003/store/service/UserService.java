package io.ducozil1003.store.service;

import io.ducozil1003.store.domain.User;
import io.ducozil1003.store.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void handleSaveUser(User user) {
        this.userRepository.save(user);
    }
    public List<User> getAllUsers() {
       return this.userRepository.findAll();
    }
    public User getDetailsUser(long id) {
        return this.userRepository.findUserById(id);
    }
    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }
}
