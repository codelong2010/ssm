package com.du.Exception;

/**
 * @author xiaolong
 * @create 2020-09-23 22:34
 * @description
 */
public class CustomException extends Exception {
    //异常信息
    public String message;
    public CustomException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
