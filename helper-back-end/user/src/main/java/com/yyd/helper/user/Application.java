package com.yyd.helper.user;

import com.yyd.helper.common.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("getUserById")
    public String getUserById(){
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        user.setNickname("nickname");
        user.setRole(1);
        return user.toString();
    }

}
