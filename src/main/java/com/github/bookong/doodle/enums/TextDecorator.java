package com.github.bookong.doodle.enums;

/**
 * 装饰器
 * 
 * @author jiangxu
 */
public enum TextDecorator {
                           /** 黑色字 */
                           F_BLOCK(30),
                           /** 红色字 */
                           F_RED(31),
                           /** 绿色字 */
                           F_GREEN(32),
                           /** 黄色字 */
                           F_YELLOW(33),
                           /** 蓝色字 */
                           F_BLUE(34),
                           /** 紫色字 */
                           F_PURPLE(35),
                           /** 天蓝字 */
                           F_AZURE(36),
                           /** 白色字 */
                           F_WHITE(37),

                           /** 黑底红字 */
                           B_BLACK_F_RED(31, 40),
                           /** 黑底白字 */
                           B_BLACK_F_WHITE(37, 40),

                           /** 红底白字 */
                           F_WHITE_B_RED(37, 41),
                           /** 绿底白字 */
                           F_WHITE_B_GREEN(37, 42),
                           /** 黄底白字 */
                           F_WHITE_B_YELLOW(37, 43),
                           /** 蓝底白字 */
                           F_WHITE_B_BLUE(37, 44),
                           /** 紫底白字 */
                           F_WHITE_B_PURPLE(37, 45),
                           /** 天蓝底白字 */
                           F_WHITE_B_AZURE(37, 46),

                           /** 白底黑字 */
                           F_BLACK_B_WHITE(30, 47);

    private TextDecorator(int color){
        this.color = color;
    }

    private TextDecorator(int color, Integer background){
        this.color = color;
        this.background = background;
    }

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
}
