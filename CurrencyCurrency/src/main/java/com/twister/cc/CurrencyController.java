package com.twister.cc;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CurrencyController {

    @GetMapping("/convert")
    public double convert(
            @RequestParam double amount,
            @RequestParam String from,
            @RequestParam String to
    ) {
        double rate = getRate(from, to);
        return amount * rate;
    }

    private double getRate(String from, String to) {


        if (from.equals("USD") && to.equals("INR")) return 83.10;
        if (from.equals("INR") && to.equals("USD")) return 0.012;
        if (from.equals("USD") && to.equals("EUR")) return 0.92;
        if (from.equals("EUR") && to.equals("USD")) return 1.08;
        if (from.equals("INR") && to.equals("EUR")) return 0.011;
        if (from.equals("EUR") && to.equals("INR")) return 90.20;

        return 1;
    }
}
