package org.ks.test;


import org.junit.Test;
import org.ks.dao.AdminDao;
import org.ks.dao.CostDao;
import org.ks.entity.Cost;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by itachi on 2017/2/9.
 */
public class TestCase {

    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        CostDao dao=ac.getBean("costDao",CostDao.class);
        List<Cost> list=dao.findAll();
        System.out.println(list);
    }

    @Test
    public void test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao dao=ac.getBean("adminDao",AdminDao.class);
        System.out.println(dao.findByCode("caocao"));
    }

    @Test
    public void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao dao=ac.getBean("dao1",AdminDao.class);
        System.out.println(dao.findByCode("caocao"));
    }
}
