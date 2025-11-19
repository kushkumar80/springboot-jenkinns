package com.nit.springboot_jenkinns;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelfController {
// this the jenkins test 
    @RequestMapping("/test")
    public String test(){
        return "This is the testing of jenkins";
    }
    @RequestMapping("/test1)
    public String test1(){        //
        return "This is the testing of Github hook trigger for GItScm polling ";
    }
}
