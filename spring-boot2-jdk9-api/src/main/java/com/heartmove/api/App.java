package com.heartmove.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * TODO: 增加描述
 *
 * @author user
 * @date 2019/9/27 16:22
 * @version 1.0.0
 * @copyright wonhigh.cn
 */
@SpringBootApplication(scanBasePackages = "com.heartmove")
@EnableJdbcRepositories(basePackages = "com.heartmove.core.repository")
@EntityScan(basePackages = "com.heartmove.core.entity")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
