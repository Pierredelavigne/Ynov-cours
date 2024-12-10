package org.example.behavior.mediator;

public abstract class User {

    protected String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);


}
