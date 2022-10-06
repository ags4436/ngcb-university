package com.ngcb.javabeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext =
        new ClassPathXmlApplicationContext(
            "beanconfig.xml");
    Object employeeSetterInjectionBeanObj = applicationContext.getBean("setterInjectionBean");
    System.out.println(employeeSetterInjectionBeanObj);
    Object employeeConstructorInjectionBeanObj = applicationContext.getBean("employeeConstructorInjectionBeanObj");
    System.out.println(employeeConstructorInjectionBeanObj);
    ManagerBeans beanInjection = (ManagerBeans)applicationContext.getBean("beanInjection");
    System.out.println(beanInjection);
  }
}
