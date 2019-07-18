package com.hand.exam.exam3test.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by zhao'yin
 * Date 2019/7/18.
 */
@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context start");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context stop");
    }
}