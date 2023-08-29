package org.learn.design.patterns.creational.builder.variant2;

public class User2 {
    /**
     * version with inner static builder class using static method as an entrypoint
     */
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User2(int id) {
        this.id = id;
    }

    public static class UserBuilder {
        private static User2 user;

        public static UserBuilder createBaseUser(int id) {
            user = new User2(id);
            return new UserBuilder();
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

        public User2 build() {
            return user;
        }
    }
}
