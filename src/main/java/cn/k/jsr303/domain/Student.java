package cn.k.jsr303.domain;

import cn.k.jsr303.inter.JGroup;
import cn.k.jsr303.inter.JJGroup;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;

public class Student {

    @NotBlank(message = "不能为空sssss",groups = JGroup.class)
    @Null(message = "一定为空",groups = JJGroup.class)
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
