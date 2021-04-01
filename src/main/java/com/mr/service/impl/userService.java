package com.mr.service.impl;

import com.mr.entity.UserVO;
import com.mr.mapper.UserVoMapper;
import com.mr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Air on 2021/3/15.
 */
@Service
public class userService implements IUserService {

    @Autowired
    private UserVoMapper userVoMa;


    @Override
    public int saveUserVo(UserVO userVO) {

        return userVoMa.userInt(userVO);
    }
}
