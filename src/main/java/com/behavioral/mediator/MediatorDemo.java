package com.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Jora");
        User user2 = new UserImpl(mediator, "Grisha");
        User user3 = new UserImpl(mediator, "Dragos");
        User user4 = new UserImpl(mediator, "Vazghent");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
