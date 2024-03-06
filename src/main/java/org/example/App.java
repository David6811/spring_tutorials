package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyBean myBean = (MyBean) context.getBean("myBean");
//        System.out.println(myBean.getMessage()); // Output: Hello, Spring!

        MyService myService = (MyService) context.getBean("myService");
        myService.performService();

        ((ClassPathXmlApplicationContext) context).close(); // Closing the context triggers bean destruction
    }
}