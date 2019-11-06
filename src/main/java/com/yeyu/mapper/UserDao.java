package com.yeyu.mapper;

import java.util.List;

import com.yeyu.pojo.User;

/**
 * mybatis
 * 
 * @author wangsh
 *
 */
public interface UserDao {

	public User findById(Integer id);

	public List<User> find();

}
