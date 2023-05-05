package edu.hdu.tcp.mapper;

import edu.hdu.tcp.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<User> selectUsers ();
    public List<User> login ( User user );
}
