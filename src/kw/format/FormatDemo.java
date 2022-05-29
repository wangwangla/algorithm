package kw.format;

import java.text.MessageFormat;

/**
 * 格式化的东西
 */
public class FormatDemo {
    public static void main(String[] args) {
//        MessageFormat messageFormat = new MessageFormat("xx");
//        System.out.println(messageFormat.getLocale());
        System.out.println(MessageFormat.format("{0}->{1}", 1, 2));
        System.out.println(String.format("%s  %s", 1, 2));

        MessageFormat format = new MessageFormat("{0} , {1}  ,{2}");
        System.out.println(format.format(new Object[]{ "b", "c","a"}));



    }
}
