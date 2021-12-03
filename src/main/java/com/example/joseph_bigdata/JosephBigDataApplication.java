package com.example.joseph_bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class JosephBigDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(JosephBigDataApplication.class, args);
    }

}
