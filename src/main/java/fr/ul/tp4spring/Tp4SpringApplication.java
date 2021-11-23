package fr.ul.tp4spring;

import fr.ul.tp4spring.dao.ICardDAO;
import fr.ul.tp4spring.model.Card;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp4SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp4SpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ICardDAO cardDAO) {
        return (args) -> {
            cardDAO.save(new Card(1, "name", "LEGENDE"));
            cardDAO.save(new Card(1, "name", "LEGENDE"));
            cardDAO.save(new Card(1, "name", "LEGENDE"));
            cardDAO.save(new Card(1, "name", "LEGENDE"));
        };
    }

}
