package com.example.SpringBootMySQL.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootMySQL.model.User;
import com.example.SpringBootMySQL.repository.UserRepository;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User>userRecords = new ArrayList<>();    
        userRepository.findAll().forEach(userRecords::add);    
        return userRecords;  
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
