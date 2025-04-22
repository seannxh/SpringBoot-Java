package com.learningjava.learn_spring_framework.database;
import java.util.Arrays;

import com.learningjava.learn_spring_framework.database.DataService;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}