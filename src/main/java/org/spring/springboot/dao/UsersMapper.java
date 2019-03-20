package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.spring.springboot.domain.Users;

import javax.annotation.ManagedBean;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);
    /**
     * 获取用戶列表
     *
     * @return
     */
    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}