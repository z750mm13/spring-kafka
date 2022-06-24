package mx.com.elektra.kafka.controller;

import mx.com.elektra.kafka.comunication.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase de prueba para la conexion con kafka
 */
@RestController
@RequestMapping("producer")
public class ProducerController {
    /**
     * Variable para ingresar el mensaje a Kafka
     */
    @Autowired
    private KafkaProducer producer;
    
    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        String response = "Proceso Exitoso";
        try {
            producer.send(message);
        } catch (Exception exception) {
            System.out.println(exception);
            response = "Ha ocurrido una excepción en el proceso: " + exception;
        }
        return response;
    }
}