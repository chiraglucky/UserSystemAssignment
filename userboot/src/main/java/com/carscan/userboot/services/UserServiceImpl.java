package com.carscan.userboot.services;

import com.carscan.userboot.modal.User;
import com.carscan.userboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//this is service layer,that implements business logic(get data,update,delete etc)
//@Service annotation indicate that they are holding business logic.
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

//    List<User> users;

//    Hard-coded data
//    public UserServiceImpl(){
//        users=new ArrayList<>();
//        users.add(new User(125,"Chirag","Dale",Date.valueOf("1997-04-08"),"Indore","8461984912"));
//        users.add(new User(126,"Anurag","Dale",Date.valueOf("2000-02-15"),"Indore","8461984567"));
//    }

    //this method returns all entities that are saved to database with the help of findAll() and return list of entities to presentation layer
    @Override
    public List<User> getUsers() {
        return userRepository.findAll(); //return list of users
    }

    //this method returns the entity whose id is given as method parameter,if no entity is found then this method returns null
    @Override
    public User getUser(long userId) {
        return this.userRepository.getOne(userId);
    }

    //this method saves the entity given as method parameter and returns the persisted entity
    @Override
    public User addUser(User user){
        return this.userRepository.save(user);
    }

    //this method firstly get the entity whose entity is given as method parameter and then set updated value then saves the entity to database again
    @Override
    public User updateUser(User user){
        User u= this.userRepository.getById(user.getId());
        u.setFname(user.getFname());
        u.setLname(user.getLname());
        u.setDob(user.getDob());
        u.setCity(user.getCity());
        u.setMobile(user.getMobile());
        return userRepository.save(u);
    }

    //this method deletes the entity whose entity is given as method parameter
    @Override
    public User deleteUser(long userId){
        User user=userRepository.getById(userId);
        userRepository.delete(user);
        return user;
    }
}
