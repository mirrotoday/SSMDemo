package com.spring.list.dao;

import com.spring.list.entity.User;

public interface UserDao {

    User findUserByid(int id);
}
