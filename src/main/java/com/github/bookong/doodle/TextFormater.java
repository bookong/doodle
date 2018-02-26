package com.github.bookong.doodle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.github.bookong.doodle.enums.TextDecorator;
import com.github.bookong.doodle.exceptions.InitError;
import com.github.bookong.doodle.exceptions.TextFormatError;

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
    public TextFormater register(String startSymbol, String endSymbol, TextDecorator textDecorator) throws InitError {
        if (symbols.containsKey(startSymbol)) {
            throw new InitError("起始标识 '" + startSymbol + "' 已经存在");
        }

        if (symbols.containsValue(endSymbol)) {
            throw new InitError("结束标识 '" + endSymbol + "' 已经存在");
        }

        if (textDecorators.containsKey(startSymbol)) {
            throw new InitError("起始标识 '" + startSymbol + "' 已经注册过装饰器");
        }

        if (textDecorators.containsValue(textDecorator)) {
            throw new InitError("装饰器 '" + textDecorator.toString() + "' 已经被其他标识注册过");
        }

        symbols.put(startSymbol, endSymbol);
        textDecorators.put(startSymbol, textDecorator);

        return this;
    }

    /** 根据注册的装饰器修饰字符串 text */
    public String format(String text) throws TextFormatError {
        List<Object> list = new ArrayList<>();
        String needEndSymbol = null; // 需要匹配的结束标识
        int normalStartPos = 0; // 普通字符串开始未知
        for (int i = 0; i < text.length(); i++) {
            if (needEndSymbol == null) {
                // 查找起始标识
                for (Entry<String, String> entry : symbols.entrySet()) {
                    int tmpEndPos = i + entry.getKey().length();
                    if (tmpEndPos < text.length()) {
                        String tmpStr = text.substring(i, tmpEndPos);
                        if (tmpStr.equals(entry.getKey())) {
                            if (normalStartPos != i) {
                                list.add(text.substring(normalStartPos, i));
                            }
                            normalStartPos = tmpEndPos;
                            list.add(textDecorators.get(entry.getKey()));
                            i = tmpEndPos - 1;
                            needEndSymbol = entry.getValue();
                            break;
                        }
                    }
                }
            } else {
                int tmpEndPos = i + needEndSymbol.length();
                if (tmpEndPos <= text.length()) {
                    String tmpStr = text.substring(i, tmpEndPos);
                    if (tmpStr.equals(needEndSymbol)) {
                        needEndSymbol = null;
                        if (normalStartPos != i) {
                            list.add(text.substring(normalStartPos, i));
                        }
                        normalStartPos = tmpEndPos;
                        i = tmpEndPos - 1;
                    }
                }
            }
        }
        list.add(text.substring(normalStartPos));

        StringBuilder result = new StringBuilder();
        TextDecorator currTextDecorator = null;
        for (Object obj : list) {
            if (obj instanceof TextDecorator) {
                currTextDecorator = (TextDecorator) obj;
            } else if (obj instanceof String) {
                if (currTextDecorator != null) {
                    result.append(currTextDecorator.format((String) obj));
                    currTextDecorator = null;
                } else {
                    result.append((String) obj);
                }
            } else {
                throw new TextFormatError("未知内容 '" + obj.toString() + "'");
            }
        }
        String resultStr = result.toString();
        for (Entry<String, String> entry : symbols.entrySet()) {
            if (resultStr.indexOf(entry.getKey()) > 0) {
                throw new TextFormatError("'" + resultStr + "' 错误的包含起始标识 '" + entry.getKey() + "'");
            }
            if (resultStr.indexOf(entry.getValue()) > 0) {
                throw new TextFormatError("'" + resultStr + "' 错误的包含结束标识 '" + entry.getValue() + "'");
            }
        }
        return resultStr;
    }

}
