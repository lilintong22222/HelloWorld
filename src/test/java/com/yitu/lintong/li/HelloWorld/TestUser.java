package com.yitu.lintong.li.HelloWorld;

import com.alibaba.fastjson.JSON;
import com.yitu.lintong.li.HelloWorld.model.User;
import com.yitu.lintong.li.HelloWorld.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUser {
    private static Logger logger = Logger.getLogger(TestUser.class);

    @Resource
    private UserService userService = null;

    @Test
    public void test() {
        Integer userId = 1;
        User user = userService.getUserById(userId);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}