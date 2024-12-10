package org.example.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    List<User> users;
    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if(user != sender) {
                user.receive(message);
            }
        }

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
