package com.wt.demo.HelloContoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloContoller {


    @GetMapping("/docker")
    @ResponseBody
    public Map helloDocker(){

        Map<String,String> resultMap = new HashMap<String,String>();

        resultMap.put("docker","hello");

        return resultMap;
    }


}
