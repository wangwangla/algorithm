package kw.locale;

import java.util.Locale;

/**
 * i18n:国际化   不同版本的翻译成访问者的语言或者内容
 * l10n:向网站添加资源，适应特定地理文化区域
 * 区域设置：语言_国家
 *
 *
 */
public class App {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        //2个大写字母形式的  国家/地区代码
        System.out.println(locale.getCountry());
        //向用户显示区域  国家名称
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());

    }
}
