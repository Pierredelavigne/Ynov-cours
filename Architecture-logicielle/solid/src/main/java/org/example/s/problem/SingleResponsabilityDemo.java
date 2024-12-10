package org.example.s.problem;

public class SingleResponsabilityDemo {

    public static void main(String[] args) {

        MailBoxSettingsService mailBoxSettingsService = new MailBoxSettingsService();

        User user = new User();

        mailBoxSettingsService.changeSecondaryEmail(user, "mohamed@email.com");

        if(mailBoxSettingsService.hasAccess(user)){
            user.sendMoney(new User(), 1000);
        }



    }
}
