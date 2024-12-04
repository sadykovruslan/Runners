package org.example;


import org.springframework.stereotype.Service;
import org.example.Data.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResultProcessor {


    public ResultProcessor(Collection <Result> results) {
        this.results = results;
    }

    public Collection<Result> results = new ArrayList<>();

    public List <Result> res (Gender gender, Distance distance, int limit){
        return results.stream()
                .filter(result -> result.hasDistance(distance) && result.hasGender(gender))
                .sorted(Comparator.comparing(Result::time))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
