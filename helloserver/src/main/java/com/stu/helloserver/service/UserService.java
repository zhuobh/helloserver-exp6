package com.stu.helloserver.service;

import com.stu.helloserver.common.Result;
import com.stu.helloserver.dto.UserDTO;
import com.stu.helloserver.vo.UserDetailVO;

public interface UserService {
    Result<String> register(UserDTO userDTO);
    Result<String> login(UserDTO userDTO);
    Result<String> getUserById(Long id);
    Result<Object> getUserPage(Integer pageNum, Integer pageSize);
    Result<UserDetailVO> getUserDetail(Long userId);
    Result<String> updateUserInfo(Long userId, UserDetailVO userDetailVO);
    Result<String> deleteUser(Long userId);
}