package src.main.java.org.example.accountservice.dto;

import java.util.List;

public class AccountDTO {
    private Long id;
    private String name;
    private String email;
    private List<CardDTO> cards;
    private List<LoanDTO> loans;

    public AccountDTO() {}

    public AccountDTO(Long id, String name, String email, List<CardDTO> cards, List<LoanDTO> loans) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cards = cards;
        this.loans = loans;
    }

    //getter methods and setters methods
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<CardDTO> getCards() {
        return cards;
    }
    
    public void setCards(List<CardDTO> cards) {
        this.cards = cards;
    }
    
    public List<LoanDTO> getLoans() {
        return loans;
    }
    
    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
}