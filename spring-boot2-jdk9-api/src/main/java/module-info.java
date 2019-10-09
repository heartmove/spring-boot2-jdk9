module spring.boot2.jdk9.api{
	requires spring.boot2.jdk9.core;
	requires spring.web;
	requires spring.beans;
	requires spring.boot;
	requires java.annotation;
	requires spring.boot.starter;
	requires spring.boot.autoconfigure;
	requires java.sql;
	requires spring.data.jdbc;

	opens com.heartmove.api;
	opens com.heartmove.api.controller;
}
