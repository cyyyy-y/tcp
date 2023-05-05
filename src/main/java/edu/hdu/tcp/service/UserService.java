package edu.hdu.tcp.service;

import edu.hdu.tcp.mapper.UserMapper;
import edu.hdu.tcp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /***查询用户*/
    public List<User> selectAdmins() {
        return this.userMapper.selectUsers ();
    }

    /***登录*/
    public List<User> login(User user) {
        if(userMapper.login(user) != null && userMapper.login(user).size() > 0) {
            System.out.println (this.userMapper.login (user));
            return this.userMapper.login (user);
        }else{
            return null;
        }
    }

}

