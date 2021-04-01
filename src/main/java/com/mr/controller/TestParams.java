package com.mr.controller;


import com.mr.entity.UserVO;
import com.mr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestParams {

    @Autowired
private IUserService userService;

    @PostMapping("/postParmas")
    public Map<String,Object> sendParams(String name,Integer id){
        Map<String,Object> params = new HashMap<>();
        params.put("name",name);
        params.put("ID",id);
        return params;
    }

 @PostMapping("/postParmasVO")
    public Map<String,Object> sendParams(UserVO userVO){
        Map<String,Object> params = new HashMap<>();
        params.put("aname",userVO.getUserName());
        params.put("aID",userVO.getUserId());
        return params;
    }

    @PostMapping("/postParmasVOR")
    public Map<String,Object> sendParams1(@RequestBody UserVO userVO){
        Map<String,Object> params = new HashMap<>();
        params.put("aname",userVO.getUserName());
        params.put("aID",userVO.getUserId());
        return params;
    }
    @PostMapping("/add")
    public Map<String,Object> saveUserVo( UserVO userVO){
        Map<String,Object> params = new HashMap<>();
        int i = userService.saveUserVo(userVO);
            params.put("key",i+"");
        return params;
    }

}
