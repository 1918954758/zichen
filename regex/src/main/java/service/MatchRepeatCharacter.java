package service;

import java.util.regex.Pattern;

/**
 * @project: MatchRepeatCharacter
 * @description: 测试重复匹配   .  +   *  ?
 * @create: 2020-08-30 21:45
 * @author:
 **/
public class MatchRepeatCharacter {
    public static void main(String[] args) {
        String str1 = "gggg";
        String str2 = "";
        String regex1 = ".*";
        String regex2 = ".+";
        String regex3 = ".*?";
        String regex4 = ".+?";
        String regex5 = ".?";

        boolean m1 = Pattern.compile(regex1).matcher(str1).matches();
        boolean m2 = Pattern.compile(regex2).matcher(str1).matches();
        boolean m3 = Pattern.compile(regex3).matcher(str1).matches();
        boolean m4 = Pattern.compile(regex4).matcher(str1).matches();
        boolean m5 = Pattern.compile(regex5).matcher(str1).matches();
        boolean m6 = Pattern.compile(regex5).matcher(str2).matches();
        System.out.println(".* 匹配【gggg】：" + m1);
        System.out.println(".+ 匹配【gggg】：" + m2);
        System.out.println(".*? 匹配【gggg】：" + m3);
        System.out.println(".+? 匹配【gggg】：" + m4);
        System.out.println(".? 匹配【gggg】：" + m5);
        System.out.println(".? 匹配【\"\"】：" + m6);
    }
}
