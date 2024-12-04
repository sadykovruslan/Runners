package org.example;


import org.example.RunnerConfig.RunnersConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var appllicationContext = new AnnotationConfigApplicationContext(RunnersConfig.class);

        ReadFromFile readFromFile = appllicationContext.getBean(ReadFromFile.class);
    }
}
