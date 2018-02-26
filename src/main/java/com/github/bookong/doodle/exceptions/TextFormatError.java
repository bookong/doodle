package com.github.bookong.doodle.exceptions;

/**
 * 格式化字符串时失败
 * 
 * @author jiangxu
 */
public class TextFormatError extends Exception {

    private static final long serialVersionUID = 6867107236278860598L;

    public TextFormatError(){
        super();
    }

    public TextFormatError(String message){
        super(message);
    }

    public TextFormatError(String message, Throwable cause){
        super(message, cause);
    }
}
