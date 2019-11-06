package com.yeyu.service;

import java.util.List;

import com.yeyu.pojo.TbUser;
import com.yeyu.pojo.User;

public interface UserService {

	public User findById(Integer id);

	public List<User> find();

	public TbUser findUserById(long id);
}
