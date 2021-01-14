package com.demo.service;

import com.demo.pojo.UserInfoDTO;
import com.demo.pojo.UserInfoVO;

public interface UserInfoService {

    public UserInfoVO getUserInfo(UserInfoDTO dto);

    public UserInfoVO getUserInfoById(Long id);


}
