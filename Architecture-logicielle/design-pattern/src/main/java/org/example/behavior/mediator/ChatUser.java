package org.example.behavior.mediator;

public class ChatUser extends User {

    public ChatUser(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " send message: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receive message: " + message);
    }
}
