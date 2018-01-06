package com.renshihan.springcloud.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication

public class ConfigClientApplication {
	@Autowired
	void setEnviroment(Environment env) {
		System.out.println("my-config.appName from env: "
				+ env.getProperty("my-config.appName"));
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
