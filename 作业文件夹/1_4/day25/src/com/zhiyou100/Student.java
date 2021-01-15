package com.zhiyou100;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc
 */
public class Student extends People{

    private int age;

    // alt+insert 快速生成 主要常用方法


    public int getAge() {
        return age;
    }

    public void setAge(int age){
        try {
            new SimpleDateFormat("").parse("2020-01-04");
        } catch (ParseException e) {
            e.printStackTrace( );
        }
        this.age = age;
    }

    /**
     * 子类重写父类方法,
     * 异常范围要 <= 父类抛出的异常范围
     */
    @Override
    public void eat() throws ArithmeticException {
        super.eat( );
    }

    // shift+alt+t 全局搜索类
    // ctrl+o 查看当前类方法和属性
    @Override
    public String toString(){
        /**
         * 父类Object的toString方法没有异常,
         * 那么子类重写时也不能抛出异常.
         * 即使有异常出现,也只能捕获
         */
        try {
            new SimpleDateFormat("").parse("2020-01-04");
        } catch (ParseException e) {
            e.printStackTrace( );
        }
        return super.toString( );
    }
}
