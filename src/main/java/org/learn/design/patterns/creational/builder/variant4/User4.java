package org.learn.design.patterns.creational.builder.variant4;

import lombok.Setter;

@Setter
public class User4 {
    /**
     * version with separate builder class with static method
     */
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User4(int id) {
        this.id = id;
    }
}
