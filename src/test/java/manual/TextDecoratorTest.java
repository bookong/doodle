package manual;

import com.github.bookong.doodle.enums.TextDecorator;

/**
 * @author jiangxu
 */
public class TextDecoratorTest {

    /**
     * Ansi Console
     * 
     * @see https://www.cnblogs.com/sivkun/p/7890547.html
     */
    public static void main(String[] args) {
        print(TextDecorator.F_BLOCK);
        print(TextDecorator.F_RED);
        print(TextDecorator.F_GREEN);
        print(TextDecorator.F_YELLOW);
        print(TextDecorator.F_BLUE);
        print(TextDecorator.F_PURPLE);
        print(TextDecorator.F_AZURE);
        print(TextDecorator.F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_BLACK_F_RED);
        print(TextDecorator.B_BLACK_F_GREEN);
        print(TextDecorator.B_BLACK_F_YELLOW);
        print(TextDecorator.B_BLACK_F_BLUE);
        print(TextDecorator.B_BLACK_F_PURPLE);
        print(TextDecorator.B_BLACK_F_AZURE);
        print(TextDecorator.B_BLACK_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_RED_F_BLOCK);
        print(TextDecorator.B_RED_F_GREEN);
        print(TextDecorator.B_RED_F_YELLOW);
        print(TextDecorator.B_RED_F_BLUE);
        print(TextDecorator.B_RED_F_PURPLE);
        print(TextDecorator.B_RED_F_AZURE);
        print(TextDecorator.B_RED_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_GREEN_F_BLOCK);
        print(TextDecorator.B_GREEN_F_RED);
        print(TextDecorator.B_GREEN_F_YELLOW);
        print(TextDecorator.B_GREEN_F_BLUE);
        print(TextDecorator.B_GREEN_F_PURPLE);
        print(TextDecorator.B_GREEN_F_AZURE);
        print(TextDecorator.B_GREEN_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_YELLOW_F_BLOCK);
        print(TextDecorator.B_YELLOW_F_RED);
        print(TextDecorator.B_YELLOW_F_GREEN);
        print(TextDecorator.B_YELLOW_F_BLUE);
        print(TextDecorator.B_YELLOW_F_PURPLE);
        print(TextDecorator.B_YELLOW_F_AZURE);
        print(TextDecorator.B_YELLOW_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_BLUE_F_BLOCK);
        print(TextDecorator.B_BLUE_F_RED);
        print(TextDecorator.B_BLUE_F_GREEN);
        print(TextDecorator.B_BLUE_F_YELLOW);
        print(TextDecorator.B_BLUE_F_PURPLE);
        print(TextDecorator.B_BLUE_F_AZURE);
        print(TextDecorator.B_BLUE_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_PURPLE_F_BLOCK);
        print(TextDecorator.B_PURPLE_F_RED);
        print(TextDecorator.B_PURPLE_F_GREEN);
        print(TextDecorator.B_PURPLE_F_YELLOW);
        print(TextDecorator.B_PURPLE_F_BLUE);
        print(TextDecorator.B_PURPLE_F_AZURE);
        print(TextDecorator.B_PURPLE_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_AZURE_F_BLOCK);
        print(TextDecorator.B_AZURE_F_RED);
        print(TextDecorator.B_AZURE_F_GREEN);
        print(TextDecorator.B_AZURE_F_YELLOW);
        print(TextDecorator.B_AZURE_F_BLUE);
        print(TextDecorator.B_AZURE_F_PURPLE);
        print(TextDecorator.B_AZURE_F_WHITE);
        System.out.println("--------");
        print(TextDecorator.B_WHITE_F_BLACK);
        print(TextDecorator.B_WHITE_F_RED);
        print(TextDecorator.B_WHITE_F_GREEN);
        print(TextDecorator.B_WHITE_F_YELLOW);
        print(TextDecorator.B_WHITE_F_BLUE);
        print(TextDecorator.B_WHITE_F_PURPLE);
        print(TextDecorator.B_WHITE_F_AZURE);
        System.out.println("--------");
    }

    private static void print(TextDecorator textDecorator) {
        System.out.println(textDecorator.format(textDecorator.getName() + " : " + textDecorator.toString()));
    }
}
