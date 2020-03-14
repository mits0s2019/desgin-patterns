package com.builder;

public class User {

   private String firstName;
   private String lastName;
   private int age;
   private String email;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email=builder.email;
    }

    public static class UserBuilder{

        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public UserBuilder() {
        }

        public UserBuilder withFirstName(String firstName){
             this.firstName=firstName;
             return this;
        }
        public UserBuilder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public UserBuilder withAge(int age){
            this.age=age;
            return this;
        }
        public UserBuilder withEmail(String email){
            this.email=email;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{\n" +
                "firstName = " + firstName + '\n' +
                "lastName = " + lastName + '\n' +
                "age = " + age +"\n"+
                "email = " + email  +
                "\n}";
    }
}
