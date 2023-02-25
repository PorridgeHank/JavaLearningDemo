package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        //指定Spring基础环境xml配置文件对应开发环境（默认-开发dev-测试test）
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //getBean()方法内部的字符串对应的是bean实例的bean name属性
        UserService userService1 = (UserService) applicationContext.getBean("userService1");
        System.out.println("执行打印，获取如下对象：" + userService1);
        //显示关闭容器
        userService1.show();

//        UserService userService2 = (UserService) applicationContext.getBean("user1");
//        System.out.println("执行打印，获取如下对象：" + userService2);
//        UserService userService3 = (UserService) applicationContext.getBean("user1");
//        System.out.println("执行打印，获取如下对象：" + userService3);
    }
}
