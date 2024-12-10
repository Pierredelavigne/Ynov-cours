package org.example.behavior.mediator;

public class Demo {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new ChatUser("Maneo",chatMediator);
        User user2 = new ChatUser("Mahot",chatMediator);
        User user3 = new ChatUser("Flavian",chatMediator);
        User user4 = new ChatUser("Tasnime",chatMediator);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Bonjour tout le monde");
        user3.send("Je suis heureux d'être là !!");

    }
}
