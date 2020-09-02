package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: MatchObliqueLine
 * @description: 匹配斜线  \
 * @create: 2020-09-02 16:53
 * @author:
 **/
public class MatchObliqueLine {
    public static void main(String[] args) {
        String obliqueLine = "\\usr\\lib\\sales";
        String regex = "\\\\";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(obliqueLine);
        System.out.println(m.find());
    }
}
class ReplaceStr{
    public static void main(String[] args) {
        String obliqueLine = "\\usr\\lib\\sales";
        String s = obliqueLine.replaceAll("\\\\", "/");
        System.out.println(s);
    }
}