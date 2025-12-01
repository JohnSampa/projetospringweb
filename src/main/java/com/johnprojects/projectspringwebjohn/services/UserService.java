package com.johnprojects.projectspringwebjohn.services;

import com.johnprojects.projectspringwebjohn.entities.User;
import com.johnprojects.projectspringwebjohn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id,User newUser){
        User entity = userRepository.getReferenceById(id);
        updateData(entity,newUser);
        return userRepository.save(entity);
    }

    private void updateData(User entity,User newUser){
        entity.setName(newUser.getName());
        entity.setEmail(newUser.getEmail());
        entity.setPhone(newUser.getPhone());
    }

}
