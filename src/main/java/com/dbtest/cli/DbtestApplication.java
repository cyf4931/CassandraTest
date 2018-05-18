package com.dbtest.cli;

import org.springframework.boot.SpringApplication;

import com.dbtest.config.Config;

public class DbtestApplication {

	public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
	}
}
