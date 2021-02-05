package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/Happy_Birthday_LZH")
    public String test(){
        return "about";
    }

//    @GetMapping("/test2")
//    public String test2(){
//        return "blogs";
//    }

    @GetMapping("/test3")
    public String test3(){
        return "index";
    }

    @GetMapping("/test4")
    public String test4(){
        return "blog";
    }

    @GetMapping("/test5")
    public String test5(){
        return "tags";
    }

    @GetMapping("/test6")
    public String test6(){
        return "archives";
    }

    @GetMapping("/test7")
    public String test7(){
        return "types";
    }

    @GetMapping("/test8")
    public String test8(){
        return "login";
    }
}













