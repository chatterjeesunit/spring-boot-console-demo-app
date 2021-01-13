package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("uuid")
public class GenerateRandomUUID implements Task{

    @Override
    public void execute() {
        System.out.println("*************************************");
        System.out.println("Generating Random UUID");
        System.out.println("*************************************");
        for (int i = 0; i < 100000; i++) {
            System.out.println(UUID.randomUUID());
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                System.out.println("Error running GenerateRandomUUID Task : "  + e.getMessage());
            }
        }
    }
}
