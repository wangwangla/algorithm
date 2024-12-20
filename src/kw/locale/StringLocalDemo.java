package kw.locale;

import java.util.Locale;

public class StringLocalDemo {
    public static void main(String[] args) {
//        localStr();
        testStr();
    }

    public static void testStr(){
        String str="";
        for (int i = 0; i < 26; i++) {
            str = str + (char) (i + 97) + "";
        }
        String upperCase = str.toUpperCase(Locale.US);
        System.out.println("原始 ：" + str);
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            String upperStr = str.toUpperCase(availableLocale);
//            System.out.println(availableLocale.getLanguage()+" :" + upperStr);
            String lowerCase = str.toLowerCase(availableLocale);
//            System.out.println(lowerCase);
            if (!upperCase.equals(upperStr)) {
                System.out.println(availableLocale.getCountry()+" :" + upperStr);
            }
            if (!str.equals(lowerCase)) {
                System.out.println(availableLocale.getCountry()+" :" + lowerCase);
            }
        }
    }

    private static void localStr() {
        String str1 = "i";
        Locale locale = new Locale("az", "");
        str1.toUpperCase(locale);
        String str = "";
        for (int i = 0; i < 26; i++) {
            str = str + (char) (i + 97) + "";
        }
        System.out.println("原始 ：" + str);
        {
            Locale TURKISH = new Locale("lt", "");
            String s = str.toUpperCase(TURKISH);
            System.out.println("立陶宛 ：" + s);
            String s1 = str.toUpperCase(Locale.US);
            String s2 = s1.toLowerCase(TURKISH);
            System.out.println("立陶宛 ：" + s2);
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s.charAt(i)) {
                } else {
                    System.out.println("---------------------" + s1.charAt(i));
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == str.charAt(i)) {

                } else {
                    System.out.println("---------------------" + s2.charAt(i));
                }
            }
        }
        {
            Locale TURKISH = new Locale("tr", "");
            String s = str.toUpperCase(TURKISH);
            System.out.println("土耳其： " + s);
            String s1 = str.toUpperCase(Locale.US);
            String s2 = s1.toLowerCase(TURKISH);
            System.out.println("土耳其 ：" + s2);
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s.charAt(i)) {
                } else {
                    System.out.println("---------------------" + s1.charAt(i));
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == str.charAt(i)) {

                } else {
                    System.out.println("---------------------" + s2.charAt(i));
                }
            }
        }
        {
            Locale TURKISH = new Locale("az", "");
            String s = str.toUpperCase(TURKISH);
            System.out.println("阿塞拜疆：" + s);
            String s1 = str.toUpperCase(Locale.US);
            String s2 = s1.toLowerCase(TURKISH);
            System.out.println("阿塞拜疆 ：" + s2);
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s.charAt(i)) {
                } else {
                    System.out.println("---------------------" + s1.charAt(i));
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == str.charAt(i)) {

                } else {
                    System.out.println("---------------------" + s2.charAt(i));
                }
            }
        }
    }
}
