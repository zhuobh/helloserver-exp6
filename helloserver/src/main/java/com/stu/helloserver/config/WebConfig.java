package com.stu.helloserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 拦截器已由 Spring Security 接管，不再需要手动注册 AuthInterceptor
    // 若未来需要添加其他非鉴权拦截器或配置，可在此继续扩展
}