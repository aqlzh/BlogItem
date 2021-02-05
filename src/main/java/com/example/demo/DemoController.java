//package com.example.demo;
//
//import com.example.mapper.BlogMapper;
//import com.example.model.Blog;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class DemoController {
//
//    @Autowired
//    private BlogMapper blogMapper;
//
////    private BlogMapper blogMapper;
//
//    @PostMapping("blog")
//    public void demo(){
//        String name = "hello";
//        Blog blog = new Blog();
//        blog.setName(name);
//        blogMapper.insertSelective(blog);
//    }
//}
