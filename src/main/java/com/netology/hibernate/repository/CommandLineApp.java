package com.netology.hibernate.repository;

import com.netology.hibernate.entity.Person;
import com.netology.hibernate.entity.PersonId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


/**
 * This class adds new data and populates the table. To test our application
 */

/*@Component
public class CommandLineApp implements CommandLineRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        List<String> cities = List.of("Moscow", "New York", "Bangkok", "Paris", "Dubai");
        List<String> names = List.of("Anna", "Vasya", "Olga", "Tomas", "Leo", "Ilon", "Joe", "Grisha", "Gosha");
        List<String> surnames = List.of("Twen", "Mask", "Grey", "Armstrong", "Kim", "Yang", "Listerman");
        Random random = new Random();
        IntStream.range(0, 20)
                .forEach(i -> {
                    Person person = Person.builder()
                            .personId(PersonId.builder()
                                    .name(names.get(random.nextInt(names.size())))
                                    .surname(surnames.get(random.nextInt(surnames.size())))
                                    .age(random.nextInt(80))
                                    .build())
                            .city(cities.get(random.nextInt(cities.size())))
                            .phoneNumber("222345" + i)
                            .build();
                    //сохраняем каждого человека в таблицу persons
                    System.out.println(person);
                    entityManager.persist(person);

                });

    }
}*/
