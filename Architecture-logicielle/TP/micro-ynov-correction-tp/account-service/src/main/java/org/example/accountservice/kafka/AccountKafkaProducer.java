package src.main.java.org.example.accountservice.kafka;


@Service
class AccountKafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(AccountKafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, Account> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public void send(Account account) {
        logger.info("Sending account='{}'", account);
        kafkaTemplate.send(topic, account);
    }

    public void sendAccountDeletedEvent(String accountId) {
        String event = String.format("{\"event\":\"ACCOUNT_DELETED\",\"accountId\":\"%s\"}", accountId);
        logger.info("Sending account deleted event for account='{}'", accountId);
        kafkaTemplate.send(topic, event);
    }
}