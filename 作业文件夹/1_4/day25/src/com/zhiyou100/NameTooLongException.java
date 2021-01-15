package com.zhiyou100;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc 名字太长异常
 */
public class NameTooLongException extends Exception{

    public NameTooLongException(String message) {
        super(message);
    }

}
