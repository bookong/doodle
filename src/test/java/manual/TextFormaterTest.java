package manual;

import com.github.bookong.doodle.TextFormater;
import com.github.bookong.doodle.enums.TextDecorator;
import com.github.bookong.doodle.exceptions.InitError;

/**
 * @author jiangxu
 */
public class TextFormaterTest {

    public static void main(String[] args) {

        TextFormater tf;
        try {
            tf = new TextFormater().register("${", "}", TextDecorator.B_WHITE_F_YELLOW).register("$[", "]", TextDecorator.B_BLACK_F_RED);

            test(tf, "1.测试${xx}得到$[ff]尺寸");
            test(tf, "$[2.测试]${xx}得到$[ff]尺寸");
            test(tf, "3.测试${xx}得到$[ff]尺寸$[fff]");
            test(tf, "4.测试${x$[x}得到$[ff]尺寸");
            test(tf, "5.测试${}$[x]得到$[ff]尺寸");
            test(tf, "6.测试${}$[x}得到$[ff]尺寸");
        } catch (InitError e) {
            e.printStackTrace();
        }

    }

    private static void test(TextFormater tf, String str) {
        try {
            System.out.println(tf.format(str));
        } catch (Exception e) {
            System.err.println(">> 解析错误 '" + str + "'");
            e.printStackTrace();
        }
    }
}
