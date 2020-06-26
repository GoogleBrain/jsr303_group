package cn.k.jsr303.controller;

import cn.k.jsr303.domain.Teacher;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping("/kk")
    public String kk(@Validated @RequestBody Teacher teacher){

        return teacher.toString();
    }
}
