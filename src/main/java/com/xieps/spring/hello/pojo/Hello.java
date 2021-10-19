package com.xieps.spring.hello.pojo;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/16 22:19
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

}
