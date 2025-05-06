package org.example;

public class User {
    private String name;
    private String email;
    private int age;
    private String phone;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public void showInfo() {
        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Age:" + age);
        System.out.println("Phone:" + phone);
    }

    /// Builder
    public static class UserBuilder {
        private String name;
        private String email;
        private int age;
        private String phone;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
