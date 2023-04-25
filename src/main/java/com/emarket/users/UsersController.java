package com.emarket.users;

import com.emarket.users.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path="/users", produces = "application/json; charset=utf-8")
public class UsersController {

    @GetMapping
    public User find() {
        User user1 = new User();
        user1.setDni(2987645L);
        user1.setName("Joakens");
        user1.setLastName("test");
        user1.setNationality("Argentino");
        return user1;
    }
}
