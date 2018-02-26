package com.github.bookong.doodle.exceptions;

/**
 * 初始化异常
 * 
 * @author jiangxu
 */
public class InitError extends Exception {

    private static final long serialVersionUID = -4046029236046801494L;

    public InitError(){
        super();
    }

    public InitError(String message){
        super(message);
    }

    public InitError(String message, Throwable cause){
        super(message, cause);
    }
}
