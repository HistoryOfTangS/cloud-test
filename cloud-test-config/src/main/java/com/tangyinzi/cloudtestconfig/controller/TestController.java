package com.tangyinzi.cloudtestconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @Value("${pkslow.age:0}")
    private Integer age;

    @Value("${pkslow.email:null}")
    private String email;

    @Value("${pkslow.webSite:null}")
    private String webSite;

    @Value("${pkslow.password:null}")
    private String password;

    @GetMapping("/pkslow")
    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("age", age.toString());
        map.put("email", email);
        map.put("webSite", webSite);
        map.put("password", password);
        return map;
    }
}
