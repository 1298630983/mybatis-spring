package cc.jasonos.mybatis.mapper;

import cc.jasonos.mybatis.pojo.User;

/**
 * Created by Jason on 2017/10/15.
 */
public interface UserMapper {

    //根据id查询用户
    public User findUserById(Integer id);
}
