package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {
    @RequestMapping("/")
    public ArrayList ArrayPracticer() {
        ArrayPractice report = new ArrayPractice();
        ArrayList result = report.practicer();
        return result;
    }
}