package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("hello")
public class HelloTask implements Task{

    @Override
    public void execute() {
        System.out.println("*************************************");
        System.out.println("Executing Hello Service");
        System.out.println("*************************************");
        for (int i = 0; i < 100000; i++) {
            System.out.println("Hello: " + i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                System.out.println("Error running Hello Task : "  + e.getMessage());
            }
        }
    }
}
