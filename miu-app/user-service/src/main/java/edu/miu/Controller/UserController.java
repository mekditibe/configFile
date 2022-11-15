package edu.miu.Controller;

import edu.miu.Service.UserServiceImpl;
import edu.miu.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAllUser();
    }



}
