package com.carscan.userboot.services;

import com.carscan.userboot.entities.User;

import java.util.List;


public interface UserService {

     public List<User> getUsers();
     public User getUser(long userId);
     public User addUser(User user);
     public User updateUser(User user);
     public void deleteUser(long userId);
}
