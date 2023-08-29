package org.learn.design.patterns.creational.builder;

import org.learn.design.patterns.creational.builder.variant1.User1;
import org.learn.design.patterns.creational.builder.variant2.User2;
import org.learn.design.patterns.creational.builder.variant3.User3;
import org.learn.design.patterns.creational.builder.variant3.User3Builder;
import org.learn.design.patterns.creational.builder.variant4.User4;
import org.learn.design.patterns.creational.builder.variant4.User4Builder;
import org.learn.design.patterns.creational.builder.variant5.User5;

public class Main {
    public static void main(String[] args) {
        int id = 42;
        String firstName = "Ivan";
        String lastName = "Ivanov";
        int age = 37;

        User1 user1 = new User1.UserBuilder(id)
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .build();
        User2 user2 = User2.UserBuilder.createBaseUser(id)
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .build();
        User3 user3 = new User3Builder(id)
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .build();
        User4 user4 = User4Builder.createBaseUser(id)
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .build();
        User5 user5 = User5.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .build();
    }
}