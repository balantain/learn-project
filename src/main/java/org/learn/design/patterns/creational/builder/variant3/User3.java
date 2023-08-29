package org.learn.design.patterns.creational.builder.variant3;

import lombok.Setter;

@Setter
public class User3 {
    /**
     * version with separate builder class
     */
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User3(int id) {
        this.id = id;
    }
}
