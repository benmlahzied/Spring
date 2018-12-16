package com.example.ms2;

//import io.micrometer.core.annotation.Timed;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/api/people")
    @Timed(extraTags = {"region", "us-east-1"})
    @Timed(value = "all.people", longTask = true)
    public List<String> get() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @GetMapping("/")
    public String hello() {
        return "ms2";
    }
}
