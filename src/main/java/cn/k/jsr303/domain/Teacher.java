package cn.k.jsr303.domain;

public class Teacher {
    private String name;

    /**
     * 自定义校验
     */
    @ListValue(vals={0,1})
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
