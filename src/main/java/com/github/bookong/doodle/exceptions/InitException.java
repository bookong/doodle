package com.github.bookong.doodle.exceptions;

/**
 * 初始化异常
 * 
 * @author jiangxu
 */
public class InitException extends Exception {

    private static final long serialVersionUID = -4046029236046801494L;

    public InitException(){
        super();
    }

    public InitException(String message){
        super(message);
    }

    public InitException(String message, Throwable cause){
        super(message, cause);
    }
}
