package manual;

import com.github.bookong.doodle.enums.TextDecorator;

/**
 * @author jiangxu
 */
public class TextDecoratorTest {

    /**
     * Ansi Console
     * 
     * @param args
     * @see https://www.cnblogs.com/sivkun/p/7890547.html
     */
    public static void main(String[] args) {
        System.out.println(TextDecorator.F_BLOCK.format("黑色字"));
        System.out.println(TextDecorator.F_RED.format("红色字"));
        System.out.println(TextDecorator.F_GREEN.format("绿色字"));
        System.out.println(TextDecorator.F_YELLOW.format("黄色字"));
        System.out.println(TextDecorator.F_BLUE.format("蓝色字"));
        System.out.println(TextDecorator.F_PURPLE.format("紫色字"));
        System.out.println(TextDecorator.F_AZURE.format("天蓝字"));
        System.out.println(TextDecorator.F_WHITE.format("白色字"));
        System.out.println();
        System.out.println(TextDecorator.B_BLACK_F_RED.format("黑底红字"));
        System.out.println(TextDecorator.B_BLACK_F_WHITE.format("黑底白字"));
        System.out.println();
        System.out.println(TextDecorator.F_WHITE_B_RED.format("红底白字"));
        System.out.println(TextDecorator.F_WHITE_B_GREEN.format("绿底白字"));
        System.out.println(TextDecorator.F_WHITE_B_YELLOW.format("黄底白字"));
        System.out.println(TextDecorator.F_WHITE_B_BLUE.format("蓝底白字"));
        System.out.println(TextDecorator.F_WHITE_B_PURPLE.format("紫底白字"));
        System.out.println(TextDecorator.F_WHITE_B_AZURE.format("天蓝底白字"));

        System.out.println(TextDecorator.F_BLACK_B_WHITE.format("白底黑字"));
    }
}
