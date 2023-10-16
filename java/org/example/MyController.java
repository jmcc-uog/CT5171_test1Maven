package org.example;

import org.joda.time.Period;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String index(){

        Period rentalPeriod = new Period().withDays(2).withHours(12);

        return "Greetings From Spring Boot" + rentalPeriod.toString();
    }
}
