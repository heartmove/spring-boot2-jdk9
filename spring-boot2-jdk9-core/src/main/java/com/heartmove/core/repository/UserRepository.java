package com.heartmove.core.repository;

import com.heartmove.core.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO: 增加描述
 *
 * @author user
 * @date 2019/9/27 15:32
 * @version 1.0.0
 * @copyright wonhigh.cn
 */
@Repository
public interface UserRepository extends CrudRepository<User,String> {
}
