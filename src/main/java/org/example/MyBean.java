package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {
    private String message;

    public MyBean() {
        this.message = "Hello, World!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialized");
        // Additional initialization logic can go here
    }

    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
        // Additional cleanup logic can go here
    }
}