package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setName("Gerard")
                .setEmail("test@test.com")
                .setAge(30)
                .setPhone("666554433")
                .build();

        System.out.println("User 1:");
        user1.showInfo();
    }
}