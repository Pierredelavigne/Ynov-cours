package org.example.o.solution;

public class Demo {


    public static void main(String[] args) {

        LoanHandler loanHandler = new GageLoanHandler(new GageLoanValidator());

        User user = new User();

        loanHandler.approveLoan(user);

        LoanHandler loanHandler1 = new PersonalLoanHandler(new PersonaLoanValidator());

        loanHandler1.approveLoan(user);

        LoanHandler loanHandler2 = new ImmoLoanHandler(new ImmoValidator());

        loanHandler2.approveLoan(user);

    }
}
