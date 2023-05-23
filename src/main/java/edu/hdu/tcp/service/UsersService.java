package edu.hdu.tcp.service;

import edu.hdu.tcp.mapper.UsersMapper;
import edu.hdu.tcp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

//    /***查询用户*/
//    public List<Users> selectAdmins() {
//        return this.usersMapper.selectUsers ();
//    }

    /***登录*/
    public boolean checkLogin(Users users) {
        String correctPwd = usersMapper.selectByPrimaryKey(users.getuId()).getPwd();
        if(correctPwd.equals(users.getPwd())) {
            return true;
        }else {
            return false;
        }
    }

    public List<Users> getLogin(Users users) {
        List<Users> usersList = new ArrayList<Users>();
        if(checkLogin(users)){
            usersList.add(usersMapper.selectByPrimaryKey(users.getuId()));
        }
        return usersList;
    }
}

