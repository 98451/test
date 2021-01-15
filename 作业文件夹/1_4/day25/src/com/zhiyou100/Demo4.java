package com.zhiyou100;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc 自己抛出异常
 */
public class Demo4 {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                // 抛出异常
                throw new RuntimeException("5出现啦!!报错!");
            }
            System.out.println(i );
        }

    }

}
