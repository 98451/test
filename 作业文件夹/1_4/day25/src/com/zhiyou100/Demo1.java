package com.zhiyou100;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc
 */
public class Demo1 {

    public static void main(String[] args) throws ParseException {
        // m1();
        // 运行时异常
        // System.out.println(1/0 );

        // 编译期异常
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        sdf.parse();

        // 解析字符串为日期对象,有[解析异常]需要处理
         new SimpleDateFormat("yyyy-MM-dd").parse("2021/01/04");
    }

    /**
     * 演示: Error
     */
    public static void m1() {
        m2();
    }

    public static void m2() {
        m1();
    }

}
