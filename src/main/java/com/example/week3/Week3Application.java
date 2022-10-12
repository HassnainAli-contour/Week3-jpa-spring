package com.example.week3;

import com.example.week3.Entities.Match;
import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.week3.Entities")
public class Week3Application {


	public static void main(String[] args) {
		SpringApplication.run(Week3Application.class, args);
	}
}
