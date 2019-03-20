package org.spring.springboot.service;

import org.spring.springboot.domain.Users;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Rich  yaoyuntao
 * Date: 2019/3/19
 * Time: 22:18
 * Description: No Description
 */
public interface UserService {

    List<Users> queryAllUsers();
}
