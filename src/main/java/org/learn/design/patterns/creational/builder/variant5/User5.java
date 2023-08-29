package org.learn.design.patterns.creational.builder.variant5;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class User5 {
    /**
     * version with @Lombok library
     */
    @NonNull
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
