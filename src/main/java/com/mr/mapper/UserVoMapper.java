package com.mr.mapper;

import com.mr.entity.UserVO;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by Air on 2021/3/15.
 */
public interface UserVoMapper {
    @Insert("insert into user_user(userId,userName) values(#{userId},#{userName})")
    public int userInt(UserVO uservo);
}
