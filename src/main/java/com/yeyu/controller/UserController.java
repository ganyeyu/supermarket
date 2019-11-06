package com.yeyu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeyu.pojo.User;
import com.yeyu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;

	@RequestMapping("/findById")
	@ResponseBody
	public String findById() {
		User user = us.findById(0);
		return user.toString();
	}

	@RequestMapping("/find")
	@ResponseBody
	public String find() {
		List<User> user = us.find();
		return user.toString();
	}
	// @RequestMapping("/findByName")
	// public void findByName() throws Exception {
	// User u = userMapper.findByName(0);
	// System.out.println(u);
	// }
	//
	// @RequestMapping("/find")
	// public void find() throws Exception {
	// List<User> find = userMapper.find();
	// for (User u : find) {
	// System.out.println(u);
	// }
	// }
	
	@RequestMapping("/findUserById")
	@ResponseBody
	public String findUserById(long id) {
		System.out.println("#######id:"+id);
		return us.findUserById(id).getCreated().toString();
	}
	
	@RequestMapping("/getIndex")
	public String getIndex() {
		return "index";
	}
}
