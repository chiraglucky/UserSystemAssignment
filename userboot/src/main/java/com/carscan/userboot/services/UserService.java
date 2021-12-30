package com.carscan.userboot.services;

import com.carscan.userboot.modal.User;

import java.util.List;

//UserService Interface :- for loosely couple,so that classes are independent to each other.
//The only knowledge one class has about the other class is that other class has exposed through its interfaces in loose coupling.
public interface UserService {

     public List<User> getUsers();
     public User getUser(long userId);
     public User addUser(User user);
     public User updateUser(User user);
     public User deleteUser(long userId);
}
