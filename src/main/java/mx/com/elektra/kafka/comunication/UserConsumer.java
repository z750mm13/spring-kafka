package mx.com.elektra.kafka.comunication;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import mx.com.elektra.kafka.models.User;


@Service
public class UserConsumer {
    @KafkaListener(topics = "topic", groupId="group_id")
    public void consume(User user) {
        System.out.print("Usuario recibido: " + user);
    }
}
