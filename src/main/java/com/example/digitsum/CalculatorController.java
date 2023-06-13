package com.example.digitsum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private int usage = 0;

    @RequestMapping("/api/digitsum/")
    public int calculator(@RequestParam int number){
        int sum = 0;
        while(number > 0){
            sum += number %10;
            number = number /10;
        }
        usage++;
        return sum;
    }

    @RequestMapping("/api/digitsum/usage")
    public int getUsage(){
        return usage;
    }
}
