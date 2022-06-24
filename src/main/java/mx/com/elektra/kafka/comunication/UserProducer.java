package mx.com.elektra.kafka.comunication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import mx.com.elektra.kafka.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    @Autowired
    private KafkaTemplate <String, Object> userTemplate;
    private String topic = "topic";
    
    public void send(User user) {
        try {
            userTemplate.send(topic, user);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}