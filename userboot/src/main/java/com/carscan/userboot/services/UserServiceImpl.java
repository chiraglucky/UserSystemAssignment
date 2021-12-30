package com.carscan.userboot.services;

import com.carscan.userboot.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    List<User> users;

    public UserServiceImpl(){
        users=new ArrayList<>();
        users.add(new User(125,"Chirag","Dale",Date.valueOf("1997-04-08"),"Indore","8461984912"));
        users.add(new User(126,"Anurag","Dale",Date.valueOf("2000-02-15"),"Indore","8461984567"));
    }

    @Override
    public List<User> getUsers() {
         return users;
    }

    @Override
    public User getUser(long userId) {
        User u=null;
        for (User user:users) {
            if(userId==user.getId()){
                u=user;
            }
        }
        return u;
    }

    @Override
    public User addUser(User user){
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(User user){
        users.forEach(e -> {
            if(e.getId()==user.getId()){
                e.setFname(user.getFname());
                e.setLname(user.getLname());
                e.setCity(user.getCity());
                e.setDob(user.getDob());
                e.setMobile(user.getMobile());
            }
        });
        return user;
    }

    @Override
    public void deleteUser(long userId){
        users=this.users.stream().filter(e->e.getId()!=userId).collect(Collectors.toList());
    }
}
