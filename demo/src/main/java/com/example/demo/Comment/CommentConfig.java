package com.example.demo.Comment;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommentConfig {
    @Bean
    CommandLineRunner commandLineRunner(CommentRepository commentRepository) {
        return args -> {
            CommentUser hoanglong = new CommentUser(
                    "long123@gmail.com",
                    "Hoang Long",
                    "Porfolio",
                    "very good");
            CommentUser minhanh = new CommentUser(
                    "ma@gmail.com",
                    "minh anh",
                    "Porfolio",
                    "very good");

            // commentRepository.saveAll(List.of(hoanglong, minhanh));
        };
    }
}
