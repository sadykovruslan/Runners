package org.example;

import org.example.Data.Distance;
import org.example.Data.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadFromFileTest {

    ReadFromFile readFromFile = new ReadFromFile();

    @Test
    void readDataFromFile() throws IOException {
        readFromFile.readDataFromFile();
        Assertions.assertEquals(20, readFromFile.allRunners.size());
    }

    @Test
    void timeToSec() {
        Assertions.assertEquals(1741, readFromFile.timeToSec("29:01"));
    }

    @Test
    void readyResult() {
        String exampleResult = "Ахмадеев Ринас,M,10 km,29:01";
        Result result = readFromFile.readyResult(exampleResult);

        Assertions.assertEquals(Distance.TEN_KM, result.distance());
        Assertions.assertEquals(1741, result.time());
    }
}