package cn.k.jsr303.exception;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 处理范围
 */
@RestControllerAdvice(basePackages = "cn.k.jsr303.controller")
public class Jsr303 {

    /**
     * 处理方法
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public String  handleValid(MethodArgumentNotValidException e){
        System.out.println(e.getMessage());
        System.out.println(e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        }
        return  e.getMessage();
    }

    @ExceptionHandler(value = Exception.class)
    public String  handleValid(Exception e){
        System.out.println(">>>>>>>>>>>>>>>>"+e.getMessage());
        System.out.println("》》》》》》》》》》"+e.getClass());
        return  e.getMessage();
    }
}
