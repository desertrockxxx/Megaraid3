package de.desertrockxxx.megaraid;

public class Main {
    public static void main(String[] args) {
        RegisteredUser user1 = new RegisteredUser(1, "Sinan", "Karateke", "desertrockxxx", "pw1234");

        user1.createNewTopic();
        user1.seeTopic();

    }
}
