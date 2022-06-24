package mx.com.elektra.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.elektra.kafka.comunication.UserProducer;
import mx.com.elektra.kafka.models.User;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserProducer producer;
    
    @PostMapping(value = "/create")
    public void create(
        @RequestParam("id") long id,
        @RequestParam("name") String name,
        @RequestParam("lastname") String lastName
    ) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setLastName(lastName);

        producer.send(user);
    }
}