package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: SimpleRegex
 * @date: 2020/8/28 3:43
 * @description: 简单的正则匹配联系，及打印匹配到的结果
 * @author:
 */
public class SimpleRegex {
    public static void main (String[] args) {
        String[] str = new String[]{"sales1.xls", "order3.xls", "sales2.xls", "sam.xls", "na1.xls", "na2.xls", "sa1.xls"};
        String regex = "[ns]a[^0-9]\\.xls";
        for(int i = 0; i < 7; i++){
            //boolean matcher = Pattern.compile(regex).matcher(str[i]).matches();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str[i]);
            while(matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }
}
