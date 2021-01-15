package com.zhiyou100;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Member;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * alt+enter 快捷键
 *  代码提示
 *  导包
 *  补全本地变量
 *  创建没有的方法
 *  修改类名
 *  -----
 *  alt+ctrl+上下,快速上下复制
 *  alt+上下. 快速上下移动
 *  ctrl+d 删除一行
 *
 */
/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc
 */
public class Demo2 {


    public static void main(String[] args) throws ParseException{
        /**
         * 抛出异常,是将异常向上抛给方法的调用者
         * 如果是主方法,那么异常就抛给虚拟机
         * 虚拟机直接输出到控制台
         */
        System.out.println("main - 1" );
        m3();// ArithmeticException

        // 调用有抛出编译期异常的方法时,也必须强制处理
       // m4();// ParseException

        System.out.println("main - 2" );
    }

    // 方法有编译期异常
//    private static void m4() throws ParseException{
//    }

    private static void m3() throws ArithmeticException{
        System.out.println("m3 - 1" );
        System.out.println(2/0 );
        System.out.println("m3 - 2" );
    }


    // shift + alt + m 抽取方法
    private static void m2() {
        /**
         * 程序一旦抛出异常,在方法抛出处,后续代码不再执行
         */
        System.out.println(1 );
        System.out.println(2/0 );
        System.out.println(3 );
    }


    /**
     * 异常处理方式一: 抛出异常
     */
    public static void m1() throws ParseException,ArithmeticException{
        // 编译期异常,抛出
        Date date  = new SimpleDateFormat("yyyy-MM-dd").parse("2021年01月04日");
        System.out.println(date );

        // 运行时异常,可以抛出,也可以不主动处理.
        // 如果不主动处理,那么虚拟机默认就是将异常抛出
        System.out.println(1/0 );
    }

}
