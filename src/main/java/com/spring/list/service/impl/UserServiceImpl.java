package com.spring.list.service.impl;
import com.spring.list.dao.UserDao;
import com.spring.list.entity.User;
import com.spring.list.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    public User findUserByid(int id) {
        return userDao.findUserByid(id);
    }
}
