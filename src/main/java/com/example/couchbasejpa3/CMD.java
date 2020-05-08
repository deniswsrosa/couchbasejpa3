package com.example.couchbasejpa3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Component;

@Component
public class CMD implements CommandLineRunner {

    @Autowired
    CouchbaseTemplate couchbaseTemplate;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... strings) throws Exception {

        User user = new User();
        user.setId("user1");
        user.setName("denis");
        user.setDescription("some description");
        user.setPosition("some position");
        userRepository.save(user);

        System.out.println(userRepository.findById("user1").get());
        System.out.println("---------------Aeeeeeee "+userRepository.findByName("denis"));
    }


    public static void main(String[] args) {

    }
}


