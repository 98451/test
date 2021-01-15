package com.zhiyou100;

/**
 * @author QiuShiju
 * @date 2021/1/4
 * @desc
 */
public class NameTooShortException extends Exception {

    public NameTooShortException(String message) {
        // 将异常信息,向上传递给父类
        super(message);
    }
}
