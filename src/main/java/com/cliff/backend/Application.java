package com.cliff.backend;

import com.cliff.backend.sample.Person;
import com.cliff.backend.sample.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * Created by Cliff on 16-1-5.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(PersonRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Person("Jack", "Bauer"));
            repository.save(new Person("Chloe", "O'Brian"));
            repository.save(new Person("Kim", "Bauer"));
            repository.save(new Person("David", "Palmer"));
            repository.save(new Person("Michelle", "Dessler"));
        };
    }

}
