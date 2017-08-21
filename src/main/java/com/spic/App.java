package com.spic;

import com.spic.springmvc.model.*;
import com.spic.springmvc.dao.selectMysqlService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        selectMysqlService customerDAO = (selectMysqlService) context.getBean("customerDAO");
       // modelHardDiskStatic customer = new modelHardDiskStatic(null,null,null,null,null);
       // customerDAO.findByCustomerId(0);

       // modelHardDiskStatic customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customerDAO.findByCustomerId(0));

    }
}
