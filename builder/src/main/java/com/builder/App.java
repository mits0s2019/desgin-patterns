package com.builder;

public class App {

    public static void main(String[] args) {

        User user=new User.UserBuilder()
                .withFirstName("dimitris")
                .withLastName("papoutsis")
                .withAge(32)
                .withEmail("dim.papoutsis.1987@gmail.com")
                .build();

        System.out.println(user);
    }
}
