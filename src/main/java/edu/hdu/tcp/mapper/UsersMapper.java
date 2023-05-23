package edu.hdu.tcp.mapper;

import edu.hdu.tcp.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}
