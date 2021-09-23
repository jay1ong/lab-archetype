package com.im.lab.test;

import com.im.lab.Application;
import com.im.lab.controller.TestController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/9/22
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class Test {

//    @Autowired
//    private TestController testController;
//
//    @org.junit.Test
//    public void testSpringValue() {
//        Assert.notNull(testController.gatewayHost, "获取不到spring value");
//        Assert.isTrue(testController.gatewayHost.equals("http://dev.cqrs.pay.proxy.gygxzc.cn"), "spring value值不正确");
//    }

}
