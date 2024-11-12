package com.example.exercise11introduction_to_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name() {
        return "My name is Hashim";
    }
    @GetMapping("/age")
    public String age() {
        return "My age is 23";
    }
    @GetMapping("/check/status")
    public String checkState() {
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Walled");names.add("Mohamed");names.add("Ali");names.add("Faisal");names.add("Hashim");
        return names;
    }


}
