package org.example;


import org.example.Data.Distance;
import org.example.Data.Gender;
import org.example.RunnerConfig.RunnersConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        var appllicationContext = new AnnotationConfigApplicationContext(RunnersConfig.class);

        ReadFromFile readFromFile = appllicationContext.getBean(ReadFromFile.class);
        ResultProcessor resultProcessor = appllicationContext.getBean(ResultProcessor.class);
        readFromFile.readDataFromFile();

        System.out.println(resultProcessor.res(Gender.MALE,  Distance.TEN_KM, 5));
    }
}
