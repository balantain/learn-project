package org.learn.design.patterns.creational.builder.variant3;

public class User3Builder {
    private User3 user;

    public User3Builder(int id) {
        user = new User3(id);
    }

    public User3Builder withFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public User3Builder withLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public User3Builder withAge(int age) {
        user.setAge(age);
        return this;
    }

    public User3 build() {
        return user;
    }
}
