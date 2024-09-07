package com.luv2code.spring_boot_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryApplication.class, args);
	}

}
//netstat -ano | findstr :8080
    //TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       1234
//tasklist | findstr 1234
    //java.exe                   1234 Console                    1     150,000 K
//taskkill /PID 1234 /F
// verify the port is free:  netstat -ano | findstr :8080