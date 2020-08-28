package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: ValidateMetaCharacter
 * @date: 2020/8/29 0:39
 * @description:
 * @author: 正则匹配元字符 【  和 。 等
 */
public class ValidateMetaCharacter {

    public static void main (String[] args) {
        String metaCharacterStr1 = "myArray[0] == 0.39";
        String metaCharacterStr2 = ".";
        String regex1 = "\\[";//经测试，元字符 “[” 必须要经过转义，才可以进行匹配，不然编译不通过
        String regex2 = ".";//经测试  .  和\\.  是一样的，同样匹配单字符“.”
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m1 = pattern1.matcher(metaCharacterStr1);
        Matcher m2 = pattern2.matcher(metaCharacterStr1);
        System.out.println(m1.find());
        System.out.println(m2.find());
        //-------------------------------------
        String validationBorder = ".";
        String regex3 = "^.$";//对于边界，必须要匹配的字符左右没有任何字符，才可以生效，只要左边或者右边有多余的字符，边界符匹配不到
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher m3 = pattern3.matcher(validationBorder);
        System.out.println(m3.find());
    }
}
