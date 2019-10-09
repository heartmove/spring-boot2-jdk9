package com.heartmove.core.service;

import com.heartmove.core.entity.User;
import com.heartmove.core.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * TODO: 增加描述
 *
 * @author user
 * @date 2019/9/27 15:37
 * @version 1.0.0
 * @copyright wonhigh.cn
 */
@Service
public class UserService {

	@Resource
	private UserRepository userRepository;

	public Optional<User> findOneUser(String userName){
		return userRepository.findById(userName);
	}
}
