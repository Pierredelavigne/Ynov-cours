package org.example.s.solution;

import lombok.Data;

@Data
public class User {

    private int id;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;

    public void sendMoney(User user, int amount) {
        System.out.println("send money");
    }


}
