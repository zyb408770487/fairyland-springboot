package com.fairyland.mgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fairyland.mgr.entity.User;
import com.fairyland.mgr.mapper.UserMapper;
import com.fasterxml.jackson.annotation.JsonRawValue;

@RestController
@RequestMapping(value = "/fairyland", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello,这是我的springboot程序";
	}
	
	public static String show() {
		return "这是我写的一个静态方法";
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		int result = userMapper.delete(id);
		if (result >= 1) {
			return "删除成功";
		} else {
			return "删除失败";
		}
	}
 
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		int result = userMapper.Update(user);
		if (result >= 1) {
			return "修改成功";
		} else {
			return "修改失败";
		}
 
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insert(User user) {
		int result = userMapper.insertUser(user);
		if (result >= 1) {
			return "保存成功";
		} else {
			return "保存失败";
		}
	}
	
	@GetMapping("/findAll")
	@JsonRawValue
	public List<User> findAll(){
		return userMapper.findAll();
	}
	
	@GetMapping("/findUserById/{id}")
	@JsonRawValue
	public List<User> findUserById(@PathVariable("id") int id){
		return userMapper.findUserById(id);
	}
	
	@GetMapping("/findUserByName/{username}")
	@JsonRawValue
	public User findUserByName(@PathVariable("username") String username){
		return userMapper.findUserByName(username);
	}
}
