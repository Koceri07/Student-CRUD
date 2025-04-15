package org.example.springhybernate164.scheduller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class PrintSchedul {
    @Scheduled(cron = "5 4 * * * *")
    public void printHello(){
        System.out.println("Hello");
    }

    @Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)
    public void printWorld(){
        System.out.println("World");
    }
}
