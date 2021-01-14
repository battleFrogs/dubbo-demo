package com.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.consumer.pojo.UserInfoParam;
import com.demo.pojo.UserInfoDTO;
import com.demo.pojo.UserInfoVO;
import com.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    //忽略启动校验，与@Service配合
    @Reference(check=false)
    private UserInfoService userInfoService;


    @RequestMapping("/getUserInfoById")
    public UserInfoVO getUserInfoById(Long id){

        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfo")
    public UserInfoVO getUserInfo(UserInfoParam userInfoParam){

        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(userInfoParam.getId());
        dto.setName(userInfoParam.getName());
        dto.setAge(userInfoParam.getAge());
        return userInfoService.getUserInfo(dto);
    }


}
