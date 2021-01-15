package com.zhiyou100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc 异常处理方法二: 捕获异常
 */
public class Demo3 {

    public static void main(String[] args) {
        m5( );

    }

    /**
     * 演示: catch捕获异常与try中抛出异常是否一致问题
     */
    private static void m5() {
        System.out.println(1 );
        try{
            System.out.println(2 );
            System.out.println(1/0 );// 抛出算术异常
            System.out.println(3 );
            /**
             * 捕获的异常类型要和抛出的一致,
             * 否则捕获不到.
             * 如果捕获不到,则继续抛出异常.
             */
        }catch (RuntimeException ie) { // 捕获下标越界异常
            System.out.println(4 );

        }
        System.out.println(5 );
    }

    /**
     * 演示: 可以同时写多个catch捕获异常
     */
    private static void m4() {
        try{

            int[] arr = {11,22,33};
            System.out.println(arr[2] );
            System.out.println(1/0 );


            /**
             * catch (Exception ae) { // 捕获下标越界异常

              }
              如果写同时写多个catch捕获异常,排在前面的异常范围不能比下面的大
             ---> 关于重写时方法异常问题?
                子类重写父类方法,子类的方法的异常范围不能比父类异常范围大.
                绝对的,父类方法没有抛出异常,那么子类也不能抛出异常
             */
        }catch (ArrayIndexOutOfBoundsException re) { // 捕获下标越界异常

        }catch (ArithmeticException ae) { // 捕获算术异常
            System.out.println("算术异常!" );
        }
    }

    /**
     * 捕获异常结构,代码执行流程
     */
    private static void m3() {
        System.out.println(1 );
        try {
            System.out.println(11 );
            System.out.println(1/0 );
            // try中抛出异常的后面不再执行
            System.out.println(12 );// 不再执行
        }catch (ArithmeticException ae) {
            System.out.println(2 );
        }
        // trycatch后续的代码,无论是否有异常,都会执行
        System.out.println(3 );
    }

    private static void m2() {
        try{
            System.out.println(1/0 );
        }catch (ArithmeticException ae) {
            System.out.println("算术异常!" );
        }
    }

    /**
     * 演示捕获异常
     */
    private static void m1() {
        try{
            Date date =
                    new SimpleDateFormat("yyyy-MM-dd").
                            parse("2021/01/04");
            System.out.println(date );
        }catch (ParseException pe) {
            /**
             * 抓到异常后,可以记录异常到日志文件,或者数据库等位置
             * 便于后期查找bug,维护项目
             */
            System.out.println("抓到异常!!" );
        }
    }

}
