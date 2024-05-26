package com.qy.comfig;

import com.qy.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)//添加拦截器
                .addPathPatterns("/**")//配置拦截路径
                .excludePathPatterns("/sys_user/login")
                .excludePathPatterns("/sys_user/patientEnroll");//配置排除路径
    }
}
