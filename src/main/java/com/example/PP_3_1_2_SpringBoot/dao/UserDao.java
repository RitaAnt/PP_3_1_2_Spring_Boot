package com.example.PP_3_1_2_SpringBoot.dao;




import com.example.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}