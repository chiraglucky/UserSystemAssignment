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

    @Override
    public List<User> getUsers() {
        return userRepository.findAll(); //return list of users
    }

    @Override
    public User getUser(long userId) {
        System.out.println("under getUser method");
        return this.userRepository.getOne(userId);
    }

    @Override
    public User addUser(User user){
        return this.userRepository.save(user);
    }

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

    @Override
    public User deleteUser(long userId){
        User user=userRepository.getById(userId);
        userRepository.delete(user);
        return user;
    }
}
