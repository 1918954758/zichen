package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: RegexWriteSpaceCharacter
 * @date: 2020/8/29 0:59
 * @description: 匹配空格\s，以及测试matcher()和matches()两个方法匹配的范围
 * @author:
 */
public class MatchWriteSpaceCharacter {

    public static void main (String[] args) {
        String tabCharacter = "     ";
        String tabCharacter1 = "101,302  394,qr3";
        String tabCharacter2 = "    ";
        String regex = "\\s*";
        String regex1 = "\\s*";
        String regex2 = "^\\s+$";
        boolean m = Pattern.compile(regex).matcher(tabCharacter).matches();
        boolean m1 = Pattern.compile(regex1).matcher(tabCharacter1).matches();
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(tabCharacter1);

        boolean m2 = Pattern.compile(regex2).matcher(tabCharacter2).matches();
        System.out.println("matches()方法是全字符串匹配：" + m);
        System.out.println("matches()方法是全字符串匹配：" + m1);
        System.out.println("matcher(str)是部分字符串匹配：" + matcher.find());
        System.out.println(m2);
    }
}

/**
 * 测试Java中空白字符
 * \b 回退并删除一个字符 backspace键
 * \f   换页符
 * \r   回车符   极少使用
 * \n   换行符   等价于  \r\n
 * \t   制表符
 * \v   垂直制表符  java中不支持
 */
class WriteSpaceCharadter{
    public static void main (String[] args) {
        //测试[\b] 和 \b
        String backSpaceCharacter1 = "abcedfghijklmnopq[\b]rstuvwxyz";
        String backSpaceCharacter2 = "abcedfghijklmnopq\brstuvwxyz";
        String skipCharacter = "abcedfghijklmnopq\frstuvwxyz";
        String enterCharacter = "abcedfghijklmnopq\rrstuvwxyz";
        String lineFeedCharacter = "abcedfghijklmnopq\nrstuvwxyz";
        String r_nCharacter = "abcedfghijklmnopq\r\nrstuvwxyz";
        String tabCharacter = "abcedfghijklmnopq\trstuvwxyz";
        //String verticalCharacter = "abcedfghijklmnopq\vrstuvwxyz";
        System.out.println("回退删除前一个字符【[\\b]】：" + backSpaceCharacter1);
        System.out.println("回退删除前一个字符【\\b】：" + backSpaceCharacter2);
        System.out.println("换页符【\\f】：" + skipCharacter);
        System.out.println("回车符【\\r】：" + enterCharacter);
        System.out.println("换行符【\\n】：" + lineFeedCharacter);
        System.out.println("【\\r\\n】：" + r_nCharacter);
        System.out.println("制表符【\\t】：" + tabCharacter);
    }
}
