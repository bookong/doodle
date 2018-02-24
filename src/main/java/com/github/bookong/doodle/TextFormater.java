package com.github.bookong.doodle;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.github.bookong.doodle.enums.TextDecorator;
import com.github.bookong.doodle.exceptions.InitException;

/**
 * @author jiangxu
 */
public class TextFormater {

    /** key 是装饰器对应的起始标识，value 是装饰器对应的结束标识 */
    private Map<String, String>        symbols        = new HashMap<>();
    /** key 是装饰器对应的起始标识，value 是对应的装饰器枚举值 */
    private Map<String, TextDecorator> textDecorators = new HashMap<>();

    /**
     * 注册标识对应的装饰器
     * 
     * @param startSymbol 起始标识
     * @param endSymbol 结束标识
     * @param textDecorator 装饰器
     */
    public TextFormater register(String startSymbol, String endSymbol, TextDecorator textDecorator) throws InitException {
        if (symbols.containsKey(startSymbol)) {
            throw new InitException("起始标识 '" + startSymbol + "' 已经存在");
        }

        if (symbols.containsValue(endSymbol)) {
            throw new InitException("结束标识 '" + endSymbol + "' 已经存在");
        }

        if (textDecorators.containsKey(startSymbol)) {
            throw new InitException("起始标识 '" + startSymbol + "' 已经注册过装饰器");
        }

        if (textDecorators.containsValue(textDecorator)) {
            throw new InitException("装饰器 '" + textDecorator.toString() + "' 已经被其他标识注册过");
        }

        if (!symbols.isEmpty()) {
            Entry<String, String> entry = symbols.entrySet().iterator().next();
            if (entry.getKey().length() != startSymbol.length()) {
                throw new InitException("起始标识 '" + startSymbol + "' 与其他标识长度必须一致");
            }
        }

        if (startSymbol.length() != endSymbol.length()) {
            throw new InitException("起始标识 '" + startSymbol + "' 与结束标识 '" + endSymbol + "' 长度必须一致");
        }

        symbols.put(startSymbol, endSymbol);
        textDecorators.put(startSymbol, textDecorator);

        return this;
    }
}
