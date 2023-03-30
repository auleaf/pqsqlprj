package com.yyzq.pqsql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PqsqlApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(PqsqlApplication.class, args);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}


}
