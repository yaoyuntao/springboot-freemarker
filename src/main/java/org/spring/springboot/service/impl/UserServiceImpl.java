package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UsersMapper;
import org.spring.springboot.domain.Users;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Rich  yaoyuntao
 * Date: 2019/3/19
 * Time: 22:19
 * Description: No Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> queryAllUsers() {
        return usersMapper.selectAll();
    }
}
