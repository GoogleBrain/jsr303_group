package cn.k.jsr303.controller;

import cn.k.jsr303.domain.Student;
import cn.k.jsr303.inter.JGroup;
import cn.k.jsr303.inter.JJGroup;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/j")
    public String valid(@Validated({JGroup.class}) @RequestBody Student student) {

        return student.toString();
    }

    @ResponseBody
    @RequestMapping("/jj")
    public String valid2(@Validated(JJGroup.class) @RequestBody Student student, BindingResult result) {
        return student.toString();
    }

    @ResponseBody
    @RequestMapping("/jjj")
    public String valid3(@Validated @RequestBody Student student, BindingResult result) {
        return student.toString();
    }
}
