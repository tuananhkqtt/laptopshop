package com.tuananh.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tuananh.laptopshop.domain.User;
import com.tuananh.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public List<User> getAllUser() {
        List<User> users = this.userRepository.findAll();
        return users;
    }

    public List<User> getAllUsersByEmail(String email) {
        List<User> users = this.userRepository.findByEmail(email);
        return users;
    }

    public void deleteAUser(long id) {
        System.out.println("delete "+id);
        this.userRepository.deleteById(id);
    }
}
