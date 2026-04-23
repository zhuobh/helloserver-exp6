package com.stu.helloserver.vo;

import lombok.Data;

/**
 * 多表联查结果接收 + 接口返回对象
 */
@Data
public class UserDetailVO {
    private Long userId;
    private String username;
    private String realName;
    private String phone;
    private String address;
}