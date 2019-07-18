package com.vidoto.appocorrencia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class AppOcorrenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOcorrenciaApplication.class, args);
		System.out.println("version: " + SpringVersion.getVersion());

		
	}

}
