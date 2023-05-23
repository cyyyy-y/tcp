package edu.hdu.tcp.controller;

import edu.hdu.tcp.model.User;
import edu.hdu.tcp.model.Users;
import edu.hdu.tcp.service.UserService;
import edu.hdu.tcp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;


    //登录
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public List<Users> login(Users users){
        System.out.println(users);
        return usersService.getLogin(users);
    }

}
