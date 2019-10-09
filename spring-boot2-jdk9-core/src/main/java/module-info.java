module spring.boot2.jdk9.core{
	requires spring.context;
	requires spring.data.commons;
	requires java.annotation;
	exports com.heartmove.core.service;
	exports com.heartmove.core.entity;
	exports com.heartmove.core.util;
	opens com.heartmove.core.entity;
	opens com.heartmove.core.service;
	opens com.heartmove.core.repository;
}

