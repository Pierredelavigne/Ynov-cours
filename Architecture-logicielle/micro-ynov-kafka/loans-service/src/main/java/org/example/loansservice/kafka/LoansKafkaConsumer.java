package org.example.loansservice.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.loansservice.service.LoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LoansKafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(LoansKafkaConsumer.class);

    @Autowired
    private LoanService loanService;

    @KafkaListener(topics = "account-events", groupId = "loan-group")
    public void consumeAccountDeletedEvent(String message){

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode event = objectMapper.readTree(message);

            if("ACCOUNT_DELETED".equals(event.get("event").asText())){
                Long accountId = Long.valueOf(event.get("accountId").asText());
                logger.info("ACCOUNT_DELETED : idAcccount : {}", accountId);
                loanService.deleteLoanByAccountId(accountId);
            }

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
