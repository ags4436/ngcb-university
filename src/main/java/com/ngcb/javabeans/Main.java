package com.ngcb.javabeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new FileSystemXmlApplicationContext(
            "G:/NGCB/ngcb-university/university/src/main/java/com/ngcb/javabeans/beanconfig.xml");
    Object employeeSetterInjectionBeanObj = applicationContext.getBean("setterInjectionBean");
    System.out.println(employeeSetterInjectionBeanObj);
    Object employeeConstructorInjectionBeanObj = applicationContext.getBean("employeeConstructorInjectionBeanObj");
    System.out.println(employeeConstructorInjectionBeanObj);

  }
}
