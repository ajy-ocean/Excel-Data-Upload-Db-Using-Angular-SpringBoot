package com.dumping.exceldatausingapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DumpingexceldataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DumpingexceldataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Testing.....");
	}
}
