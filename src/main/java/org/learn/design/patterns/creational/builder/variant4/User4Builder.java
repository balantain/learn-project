package org.learn.design.patterns.creational.builder.variant4;

public class User4Builder {
    private static User4 user;

    public static User4Builder createBaseUser(int id) {
        user = new User4(id);
        return new User4Builder();
    }

    public User4Builder withFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public User4Builder withLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public User4Builder withAge(int age) {
        user.setAge(age);
        return this;
    }

    public User4 build() {
        return user;
    }

}
