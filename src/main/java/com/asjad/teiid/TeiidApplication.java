package com.asjad.teiid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeiidApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TeiidApplication.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.currentThread().join();
	}
}

