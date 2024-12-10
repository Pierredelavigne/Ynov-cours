package org.example.s.solution;

public class MailBoxSettingsService {

    private SecurityService securityService;

    {
        securityService = new SecurityService();
    }

    public void changeSecondaryEmail(User user, String secondaryEmail) {
        if (securityService.hasAccess(user)) {
            user.setSecondaryEmail(secondaryEmail);
        }
    }





}
