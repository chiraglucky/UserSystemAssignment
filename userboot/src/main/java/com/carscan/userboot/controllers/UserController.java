package com.carscan.userboot.controllers;

import com.carscan.userboot.modal.User;
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
    public ResponseEntity<Object> getUsers(){
         List<User> users=this.userService.getUsers();
         if(users.isEmpty()){
             return new ResponseEntity<>("Data not exist",HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(users,HttpStatus.OK);
    }

    //get user by user id
    @GetMapping("/users/{userId}")
    public ResponseEntity<Object> getUser(@PathVariable String userId){
        User u=this.userService.getUser(Long.parseLong(userId));
        if(u==null){
            return new ResponseEntity<>("Data not exist",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(u,HttpStatus.OK);
    }

    //Add a new user
    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        User u=this.userService.addUser(user);
        if(u!=null){
            return new ResponseEntity<>("Successfully added",HttpStatus.OK);
        }
        return new ResponseEntity<>("Not added",HttpStatus.BAD_REQUEST);
    }

    //Update user
    @PutMapping("/users")
    public ResponseEntity<Object> updateUser(@RequestBody User user){
        User u= this.userService.updateUser(user);
        if(u!=null){
            return new ResponseEntity<>("Successfully updated",HttpStatus.OK);
        }
        return new ResponseEntity<>("Not modified",HttpStatus.NOT_MODIFIED);
    }

    //delete user
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable String userId){
        User u=this.userService.deleteUser(Long.parseLong(userId));
        if(u!=null){
            return new ResponseEntity<>("Successfully deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Data does not exist",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
