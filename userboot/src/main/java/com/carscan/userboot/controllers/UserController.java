package com.carscan.userboot.controllers;

import com.carscan.userboot.entities.User;
import com.carscan.userboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    //get all users
    @GetMapping("/users")
    public List<User> getUsers(){
         return userService.getUsers();
    }

    //get user by id
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUser(Long.parseLong(userId));
    }

    //Add a new user
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    //Update user
    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    //delete user
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId){
        try {
            this.userService.deleteUser(Long.parseLong(userId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
