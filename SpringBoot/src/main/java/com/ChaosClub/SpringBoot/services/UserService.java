package com.ChaosClub.SpringBoot.services;

import com.ChaosClub.SpringBoot.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // marks this class as a spring service component
public class UserService {
    // dependency on user repository (this service class depends on user repository)
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    //CREATE
    //This method is used to create a user in DB with given data in request coming from the controller
    public User createUser(User user){
        return userRepository.save(user);
    }

    //READ
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //READ ONLY 1 USER WITH ID
    public Optional<User> getUserById(Long id){
        //Optional is used to handle cases where a user might not be found
        return userRepository.findById(id);
    }

    //UPDATE
    public Optional<User> updateUser(Long id,User userDetails){
        return userRepository.findById(id)
                .map(existingUser->{
                    existingUser.setFullName(userDetails.getName());
                    existingUser.setPassword(userDetails.getPassword());
                    return userRepository.save(existingUser);
                });
    }
}
