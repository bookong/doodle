package com.github.bookong.doodle.enums;

import com.github.bookong.doodle.common.GlobalConstant.TextDecoratorColor.BackgroundColor;
import com.github.bookong.doodle.common.GlobalConstant.TextDecoratorColor.FontColor;

/**
 * 装饰器
 * 
 * @author jiangxu
 */
public enum TextDecorator {
                           F_BLOCK("黑色字", FontColor.BLACK), //
                           F_RED("红色字", FontColor.RED), //
                           F_GREEN("绿色字", FontColor.GREEN), //
                           F_YELLOW("黄色字", FontColor.YELLOW), //
                           F_BLUE("蓝色字", FontColor.BLUE), //
                           F_PURPLE("紫色字", FontColor.PURPLE), //
                           F_AZURE("天蓝字", FontColor.AZURE), //
                           F_WHITE("白色字", FontColor.WHITE), //
                           // ------------------
                           B_BLACK_F_RED("黑底红字", FontColor.RED, BackgroundColor.BLACK), //
                           B_BLACK_F_GREEN("黑底绿字", FontColor.GREEN, BackgroundColor.BLACK), //
                           B_BLACK_F_YELLOW("黑底黄字", FontColor.YELLOW, BackgroundColor.BLACK), //
                           B_BLACK_F_BLUE("黑底蓝字", FontColor.BLUE, BackgroundColor.BLACK), //
                           B_BLACK_F_PURPLE("黑底紫字", FontColor.PURPLE, BackgroundColor.BLACK), //
                           B_BLACK_F_AZURE("黑底天蓝字", FontColor.AZURE, BackgroundColor.BLACK), //
                           B_BLACK_F_WHITE("黑底白字", FontColor.WHITE, BackgroundColor.BLACK), //
                           // ------------------
                           B_RED_F_BLOCK("红底黑字", FontColor.BLACK, BackgroundColor.RED), //
                           B_RED_F_GREEN("红底绿字", FontColor.GREEN, BackgroundColor.RED), //
                           B_RED_F_YELLOW("红底黄字", FontColor.YELLOW, BackgroundColor.RED), //
                           B_RED_F_BLUE("红底蓝字", FontColor.BLUE, BackgroundColor.RED), //
                           B_RED_F_PURPLE("红底紫字", FontColor.PURPLE, BackgroundColor.RED), //
                           B_RED_F_AZURE("红底天蓝字", FontColor.AZURE, BackgroundColor.RED), //
                           B_RED_F_WHITE("红底白字", FontColor.WHITE, BackgroundColor.RED), //
                           // ------------------
                           B_GREEN_F_BLOCK("绿底黑字", FontColor.BLACK, BackgroundColor.GREEN), //
                           B_GREEN_F_RED("绿底红字", FontColor.RED, BackgroundColor.GREEN), //
                           B_GREEN_F_YELLOW("绿底黄字", FontColor.YELLOW, BackgroundColor.GREEN), //
                           B_GREEN_F_BLUE("绿底蓝字", FontColor.BLUE, BackgroundColor.GREEN), //
                           B_GREEN_F_PURPLE("绿底紫字", FontColor.PURPLE, BackgroundColor.GREEN), //
                           B_GREEN_F_AZURE("绿底天蓝字", FontColor.AZURE, BackgroundColor.GREEN), //
                           B_GREEN_F_WHITE("绿底白字", FontColor.WHITE, BackgroundColor.GREEN), //
                           // ------------------
                           B_YELLOW_F_BLOCK("黄底黑字", FontColor.BLACK, BackgroundColor.YELLOW), //
                           B_YELLOW_F_RED("黄底红字", FontColor.RED, BackgroundColor.YELLOW), //
                           B_YELLOW_F_GREEN("黄底绿字", FontColor.GREEN, BackgroundColor.YELLOW), //
                           B_YELLOW_F_BLUE("黄底蓝字", FontColor.BLUE, BackgroundColor.YELLOW), //
                           B_YELLOW_F_PURPLE("黄底紫字", FontColor.PURPLE, BackgroundColor.YELLOW), //
                           B_YELLOW_F_AZURE("黄底天蓝字", FontColor.AZURE, BackgroundColor.YELLOW), //
                           B_YELLOW_F_WHITE("黄底白字", FontColor.WHITE, BackgroundColor.YELLOW), //
                           // ------------------
                           B_BLUE_F_BLOCK("蓝底黑字", FontColor.BLACK, BackgroundColor.BLUE), //
                           B_BLUE_F_RED("蓝底红字", FontColor.RED, BackgroundColor.BLUE), //
                           B_BLUE_F_GREEN("蓝底绿字", FontColor.GREEN, BackgroundColor.BLUE), //
                           B_BLUE_F_YELLOW("蓝底黄字", FontColor.YELLOW, BackgroundColor.BLUE), //
                           B_BLUE_F_PURPLE("蓝底紫字", FontColor.PURPLE, BackgroundColor.BLUE), //
                           B_BLUE_F_AZURE("蓝底天蓝字", FontColor.AZURE, BackgroundColor.BLUE), //
                           B_BLUE_F_WHITE("蓝底白字", FontColor.WHITE, BackgroundColor.BLUE), //
                           // ------------------
                           B_PURPLE_F_BLOCK("紫底黑字", FontColor.BLACK, BackgroundColor.PURPLE), //
                           B_PURPLE_F_RED("紫底红字", FontColor.RED, BackgroundColor.PURPLE), //
                           B_PURPLE_F_GREEN("紫底绿字", FontColor.GREEN, BackgroundColor.PURPLE), //
                           B_PURPLE_F_YELLOW("紫底黄字", FontColor.YELLOW, BackgroundColor.PURPLE), //
                           B_PURPLE_F_BLUE("紫底蓝字", FontColor.BLUE, BackgroundColor.PURPLE), //
                           B_PURPLE_F_AZURE("紫底天蓝字", FontColor.AZURE, BackgroundColor.PURPLE), //
                           B_PURPLE_F_WHITE("紫底白字", FontColor.WHITE, BackgroundColor.PURPLE), //
                           // ------------------
                           B_AZURE_F_BLOCK("天蓝底黑字", FontColor.BLACK, BackgroundColor.AZURE), //
                           B_AZURE_F_RED("天蓝底红字", FontColor.RED, BackgroundColor.AZURE), //
                           B_AZURE_F_GREEN("天蓝底绿字", FontColor.GREEN, BackgroundColor.AZURE), //
                           B_AZURE_F_YELLOW("天蓝底黄字", FontColor.YELLOW, BackgroundColor.AZURE), //
                           B_AZURE_F_BLUE("天蓝底蓝字", FontColor.BLUE, BackgroundColor.AZURE), //
                           B_AZURE_F_PURPLE("天蓝底紫字", FontColor.PURPLE, BackgroundColor.AZURE), //
                           B_AZURE_F_WHITE("天蓝底白字", FontColor.WHITE, BackgroundColor.AZURE), //
                           // ------------------
                           B_WHITE_F_BLACK("白底黑字", FontColor.BLACK, BackgroundColor.WHITE), //
                           B_WHITE_F_RED("白底红字", FontColor.RED, BackgroundColor.WHITE), //
                           B_WHITE_F_GREEN("白底绿字", FontColor.GREEN, BackgroundColor.WHITE), //
                           B_WHITE_F_YELLOW("白底黄字", FontColor.YELLOW, BackgroundColor.WHITE), //
                           B_WHITE_F_BLUE("白底蓝字", FontColor.BLUE, BackgroundColor.WHITE), //
                           B_WHITE_F_PURPLE("白底紫字", FontColor.PURPLE, BackgroundColor.WHITE), //
                           B_WHITE_F_AZURE("白底天蓝字", FontColor.AZURE, BackgroundColor.WHITE);

    private TextDecorator(String name, int color){
        this.name = name;
        this.color = color;
    }

    private TextDecorator(String name, int color, Integer background){
        this.name = name;
        this.color = color;
        this.background = background;
    }

    private String  name;
    private int     color;
    private Integer background;

    /** 格式化字符串 */
    public String format(String str) {
        if (background == null) {
            return String.format("\033[%dm%s\033[0m", color, str);
        } else {
            return String.format("\033[%d;%dm%s\033[0m", background, color, str);
        }
    }

    public String getName() {
        return name;
    }
}
