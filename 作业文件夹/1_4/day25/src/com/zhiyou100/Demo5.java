package com.zhiyou100;

import java.util.Arrays;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc 演示异常常用方法
 */
public class Demo5 {

    public static void main(String[] args) {
        System.out.println(1 );
        try {
            System.out.println(1/0 );
        }catch (ArithmeticException ae) {
            // getMessage(); 获得异常信息.即创建异常时,构造方法中的参数
            String message = ae.getMessage( );
            //System.out.println(message );

            // printStackTrace(); 打印堆栈信息即完整异常现象
            //ae.printStackTrace();

            // toString(); 以字符串的形式返回异常信息,没有异常位置
            // System.out.println(ae.toString() );

            // StackTraceElement[] getStackTrace();
            StackTraceElement[] stackTrace = ae.getStackTrace( );
            // System.out.println(Arrays.toString(stackTrace ) );
            for (int i = 0; i < stackTrace.length; i++) {
                System.out.println("抛异常的类: "+stackTrace[i].getClassName() );
                System.out.println("抛异常的方法: "+stackTrace[i].getMethodName() );
                System.out.println("抛异常的行号: "+stackTrace[i].getLineNumber() );
                System.out.println("抛异常的原因: "+message );
            }
        }
        System.out.println(2 );
    }

}
