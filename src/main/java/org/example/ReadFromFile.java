package org.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.Data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReadFromFile {

    @Autowired
//    public ReadFromFile(List<Result> allRunners) {
//        this.allRunners = allRunners;
//    }

    List<Result> allRunners = new ArrayList<>();

    public void readDataFromFile() throws IOException {
        String path = "D:\\Java\\Runners\\src\\main\\resources\\results.csv";
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String line = bf.readLine();

        while (line != null) {
            allRunners.add(readyResult(line));
            line = bf.readLine();
        }
        bf.close();
    }

    public int timeToSec(String resultRunner) {
        String splitter = ":";
        String[] minSecStr = resultRunner.split(splitter);
        return Integer.parseInt(minSecStr[0]) * 60 + Integer.parseInt(minSecStr[1]);
    }

    public Result readyResult(String timeOfRunner) {
        String[] runs = timeOfRunner.split(",");
        Runner run = new Runner(runs[0], Gender.isG(runs[1]));
        return new Result(run,
                Distance.isD(runs[2]),
                timeToSec(runs[3]));
    }
}




