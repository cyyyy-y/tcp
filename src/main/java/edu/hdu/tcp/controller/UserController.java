package edu.hdu.tcp.controller;

import edu.hdu.tcp.model.User;
import edu.hdu.tcp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUsers")
    public List<User> selectAdmins() {
        return this.userService.selectAdmins ();
    }

    //登录(默认用户名密码都是admin)
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public List<User> login( User user){
        return this.userService.login ( user );
    }

}
