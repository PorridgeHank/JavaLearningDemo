package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //service业务层代码需要调用dao层代码来完成对应业务动作
    //beanFactory调用该方法，从容器中获取userdao，设置到此处
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("执行打印，完成如下操作：set方法执行，对应对象：" + userDao);
    }

    public void show(){
        System.out.println(userDao);
    }

    //
//    public void init(){
//        System.out.println("执行打印，完成如下操作：UseServiceImpl初始化成功！");
//    }
//
//    public  void destroy(){
//        System.out.println("执行打印，完成如下操作：UseServiceImpl销毁完毕！");
//    }
//
//    public UserServiceImpl() {
//        System.out.println("执行打印，完成如下操作：UseServiceImpl实例化完成！");
//    }
//

//    //Service内部需要注入dao,注入阶段涉及属性设置，
//    public void afterPropertiesSet() throws Exception {
//
//    }
}
