package com.agh.hr.persistence.service;

import com.agh.hr.persistence.model.User;
import com.agh.hr.persistence.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public Optional<User> saveUser(User user) {
        try {
            return Optional.of(userRepository.save(user));
        } catch(Exception e) {
            return Optional.empty();
        }
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long UserId) {
            userRepository.deleteById(UserId);
    }

    public List<User> getByFirstname(String firstname) {
        return userRepository.findByPersonalData_Firstname(firstname);
    }

    public List<User> getByLastname(String lastname) {
        return userRepository.findByPersonalData_Lastname(lastname);
    }

    public List<User> getByFullName(String firstname,String lastname) {
        return userRepository.findByPersonalData_FirstnameAndPersonalData_Lastname(firstname,lastname);
    }



}
