package com.demo.provide.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.pojo.UserInfoDTO;
import com.demo.pojo.UserInfoVO;
import com.demo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserInfoInfoServiceImpl implements UserInfoService {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoInfoServiceImpl.class);

    @Override
    public UserInfoVO getUserInfo(UserInfoDTO dto) {

        UserInfoVO vo = new UserInfoVO();
        vo.setId(dto.getId());
        vo.setAge(dto.getAge());
        vo.setName(dto.getName());
        vo.setAddress("清华大学");
        return vo;
    }

    @Override
    public UserInfoVO getUserInfoById(Long id) {
        UserInfoVO vo = new UserInfoVO();
        vo.setId(id);
        vo.setAge(20);
        vo.setName("小明");
        vo.setAddress("北京大学");
        return vo;
    }

}
