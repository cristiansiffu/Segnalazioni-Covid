package com.Segnalazioni.Covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //(exclude = { DataSourceAutoConfiguration.class })
//@ComponentScan(basePackages={"com.Segnalazioni.Covid"})

public class SegnalazioniCovidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegnalazioniCovidApplication.class, args);
	}

}
