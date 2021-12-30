package com.carscan.userboot.controllers;

import com.carscan.userboot.modal.User;
import com.carscan.userboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller used to handle requests coming from the client
//@ResponseBody tells controller that send the return object as the body(JSON format) rather than a view.
//@RestController combines @Controller and @ResponseBody
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    //get all users
    //this method is used for handling get request
    //this method checks users exist in database or not if yes then return list of users with http status OK otherwise it will return http status NOT_FOUND
    @GetMapping("/users")
    public ResponseEntity<Object> getUsers(){
         List<User> users=this.userService.getUsers();
         if(users.isEmpty()){
             return new ResponseEntity<>("Data does not exist",HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(users,HttpStatus.OK);
    }

    //get user by user id
    //this method checks user with specified id if exist in database then return user with http status OK otherwise it will return http status NOT_FOUND
    @GetMapping("/users/{userId}")
    public ResponseEntity<Object> getUser(@PathVariable String userId){
        User u=this.userService.getUser(Long.parseLong(userId));
        if(u==null){
            return new ResponseEntity<>("Data does not exist",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(u,HttpStatus.OK);
    }

    //add a new user
    //this method is used for handling post request
    //this method add a user in database and if user is successfully added then return http status OK ,otherwise it will return http status BAD_REQUEST
    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        User u=this.userService.addUser(user);
        if(u!=null){
            return new ResponseEntity<>("Successfully added",HttpStatus.OK);
        }
        return new ResponseEntity<>("Not added",HttpStatus.BAD_REQUEST);
    }

    //update user
    //this method is used for handling put request
    //this method update user in database and if user is successfully updated then return http status OK ,otherwise it will return http status NOT_MODIFIED
    @PutMapping("/users")
    public ResponseEntity<Object> updateUser(@RequestBody User user){
        User u= this.userService.updateUser(user);
        if(u!=null){
            return new ResponseEntity<>("Successfully updated",HttpStatus.OK);
        }
        return new ResponseEntity<>("Not modified",HttpStatus.NOT_MODIFIED);
    }

    //delete user
    //this method is used for handling delete request
    //this method checks a user with specified id,if exist in database then delete user from database and return http status OK ,otherwise it will return http status NOT_FOUND
    @DeleteMapping("/users/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable String userId){
        User u=this.userService.deleteUser(Long.parseLong(userId));
        if(u!=null){
            return new ResponseEntity<>("Successfully deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Data does not exist",HttpStatus.NOT_FOUND);
        }
    }
}
