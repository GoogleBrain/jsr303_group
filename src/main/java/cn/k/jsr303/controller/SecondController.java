package cn.k.jsr303.controller;

import cn.k.jsr303.domain.Teacher;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SecondController {

    @RequestMapping("/kk")
    public String kk(@Validated @RequestBody Teacher teacher){
        int a=10/0;
        return teacher.toString();
    }


    @RequestMapping("/kkk")
    public String kkk(){
        int a=10/0;
        return "当前时间>>>>>"+new Date();
    }
}
