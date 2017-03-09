package com.emedinaa.meetup.data.mapper;

import com.emedinaa.meetup.data.entity.UserEntity;
import com.emedinaa.meetup.domain.entity.User;

/**
 * Created by eduardo on 11/12/16.
 */
public class UserMapper {

    public User transform(UserEntity userEntity){
        User user= new User();
        if(userEntity==null) return user;
        user.setId(userEntity.getId());
        user.setEmail(userEntity.getEmail());
        user.setName(userEntity.getName());
        return  user;
    }
}
