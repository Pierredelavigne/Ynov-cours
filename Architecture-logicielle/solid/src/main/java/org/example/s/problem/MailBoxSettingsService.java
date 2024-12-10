package org.example.s.problem;

public class MailBoxSettingsService {

    public void changeSecondaryEmail(User user, String secondaryEmail) {
        if (hasAccess(user)) {
            user.setSecondaryEmail(secondaryEmail);
        }
    }

    public boolean hasAccess(User user) {
        if(user.getRole() == Role.ADMIN) {
            return true;
        } else {
            return false;
        }
    }


}
