package org.example.s.solution;

public class SingleResponsabilityDemo {

    public static void main(String[] args) {

        MailBoxSettingsService mailBoxSettingsService = new MailBoxSettingsService();
        User user = new User();
        mailBoxSettingsService.changeSecondaryEmail(user, "mohamed@email.com");
        SecurityService securityService = new SecurityService();
        if(securityService.hasAccess(user)){
            user.sendMoney(new User(), 1000);
        }



    }
}
