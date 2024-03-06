package org.example;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    private MyBean myBean;

    // Constructor for dependency injection
    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public void performService() {
        // Using the injected MyBean
        System.out.println("Performing service with message: " + myBean.getMessage());
    }
}
