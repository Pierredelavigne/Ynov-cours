package src/main/java/org/example/accountservice/service/external;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

@Service
public class ExternalService {
    private final RestTemplate restTemplate;

    public ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<CardDTO> getCardsByAccountId(Long accountId) {
        String url = "http://card-service/cards/account/" + accountId;
        ResponseEntity<List<CardDTO>> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<CardDTO>>() {}
        );
        return response.getBody();
    }

    public List<LoanDTO> getLoansByAccountId(Long accountId) {
        String url = "http://loan-service/loans/account/" + accountId;
        ResponseEntity<List<LoanDTO>> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<LoanDTO>>() {}
        );
        return response.getBody();
    }
}
