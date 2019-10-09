package com.heartmove.api.controller;

import com.heartmove.core.entity.User;
import com.heartmove.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: 增加描述
 *
 * @author user
 * @date 2019/9/27 15:39
 * @version 1.0.0
 * @copyright wonhigh.cn
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/*@Resource
	private UserRepository userRepository;*/

	@GetMapping("/{userName}")
	public User findOneUser(@PathVariable("userName") String userName){
		return userService.findOneUser(userName).get();
	}
}
