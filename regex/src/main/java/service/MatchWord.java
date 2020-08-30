package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: MatchWord
 * @description: 单词匹配符  \b
 * @create: 2020-08-31 00:04
 * @author:
 **/
@SuppressWarnings("DuplicatedCode")
public class MatchWord {
    public static void main(String[] args) {
        String str1 = "The captain wore his";
        String regex1 = "\\bcap";
        String regex2 = "\\bcap\\b";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher m1 = pattern1.matcher(str1);
        System.out.println("单词【\\bcap】匹配【The captain wore his】：" + m1.find());
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m2 = pattern2.matcher(str1);
        System.out.println("单词【\\bcap\\b】匹配【The captain wore his】：" + m2.find());

        String str2 = "The cap tain wore his";
        String regex3 = "\\bcap";
        String regex4 = "\\bcap\\b";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher m3 = pattern3.matcher(str2);
        System.out.println("单词【\\bcap】匹配【The cap tain wore his】：" + m3.find());
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher m4 = pattern4.matcher(str2);
        System.out.println("单词【\\bcap\\b】匹配【The cap tain wore his】：" + m4.find());
    }
}
