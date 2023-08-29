package org.learn.design.patterns.creational.builder.variant1;

public class User1 {
    /**
     * version with inner static builder class
     */
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User1(int id) {
        this.id = id;
    }

    public static class UserBuilder {
        private User1 user;

        public UserBuilder(int id) {
            user = new User1(id);
        }

        public UserBuilder withFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public UserBuilder withAge(int age) {
            user.age = age;
            return this;
        }

        public User1 build() {
            return user;
        }
    }
}
