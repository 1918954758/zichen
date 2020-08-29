package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: MatchSpecialCharacter
 * @date: 2020/8/30 0:44
 * @description: 匹配特定的字符类型
 * @author:
 */
public class MatchSpecialCharacter {

    /*
     * @description 匹配数字/非数字
     * /d   匹配数字
     * /D   匹配非数字
     */
    public static void main(String[] args) {
        String str1 = "if (myArray[0] == 0)";
        String regex1 = "\\[\\d]";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher m1 = pattern1.matcher(str1);
        System.out.println("匹配数字【\\[\\d】：" + m1.find());

        String str2 = "12d34567890";
        String regex2 = "\\D";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m2 = pattern2.matcher(str2);
        System.out.println("匹配非数字【\\D】：" + m2.find());
    }
}

class MatchLetterAndNumCharacter{
    /*
     * @description 匹配字母数字下横线/非字母数字下横线
     * /w   匹配字母数字下横线
     * /W   匹配非字母数字下横线
     */
    @SuppressWarnings("DuplicatedCode")
    public static void main(String[] args) {
        String str1 = "s";
        String str2 = "7";
        String str3 = "_";
        String str4 = "\\";
        String regex1 = "\\w";
        String regex2 = "\\w";
        String regex3 = "\\w";
        String regex4 = "\\w";
        boolean m1 = Pattern.compile(regex1).matcher(str1).matches();
        boolean m2 = Pattern.compile(regex2).matcher(str2).matches();
        boolean m3 = Pattern.compile(regex3).matcher(str3).matches();
        boolean m4 = Pattern.compile(regex4).matcher(str4).matches();
        System.out.println("匹配字母【\\w】：" + m1);
        System.out.println("匹配数字【\\w】：" + m2);
        System.out.println("匹配下横线【\\w】：" + m3);
        System.out.println("匹配反斜杠【\\w】：" + m4);

        System.out.println("============================================================");

        String str5 = "\\";
        String str6 = ".";
        String str7 = " ";
        String str8 = "k";
        String regex5 = "\\W";
        String regex6 = "\\W";
        String regex7 = "\\W";
        String regex8 = "\\W";
        boolean m5 = Pattern.compile(regex5).matcher(str5).matches();
        boolean m6 = Pattern.compile(regex6).matcher(str6).matches();
        boolean m7 = Pattern.compile(regex7).matcher(str7).matches();
        boolean m8 = Pattern.compile(regex8).matcher(str8).matches();
        System.out.println("匹配字母【\\w】：" + m5);
        System.out.println("匹配数字【\\w】：" + m6);
        System.out.println("匹配下横线【\\w】：" + m7);
        System.out.println("匹配反斜杠【\\w】：" + m8);
    }
}
