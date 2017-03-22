package com.jiaqu.icb.service.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiaqu.icb.dao.IUserDao;
import com.jiaqu.icb.pojo.user.User;
import com.jiaqu.icb.service.user.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}