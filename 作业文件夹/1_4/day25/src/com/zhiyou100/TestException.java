package com.zhiyou100;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc
 */
public class TestException {

    public static void main(String[] args) throws Exception{
        checkName("刘");
    }

    public static void checkName(String name) throws NameTooLongException, NameTooShortException {
        if (name.length( ) > 4) {
            // 抛出名字太长异常
            throw new NameTooLongException("名字太短长:\""+name+"\"");

        } else if (name.length( ) < 2) {
            // 抛出名字太短异常
            throw new NameTooShortException("名字太短:\""+name+"\"" );

        }
        System.out.println("名字刚好,可以注册!" );
    }

}
