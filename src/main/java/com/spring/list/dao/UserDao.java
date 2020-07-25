package com.spring.list.dao;

import com.spring.list.entity.User;
import java.util.List;
public interface UserDao {

   // User findUserByid(int id);
    List<User> findAll();


}
