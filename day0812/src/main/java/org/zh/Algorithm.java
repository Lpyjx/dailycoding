package org.zh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。

注意：

如果 a 的 第二次 出现比 b 的 第二次 出现在字符串中的位置更靠前，则认为字母 a 在字母 b 之前出现两次。
s 包含至少一个出现两次的字母。
 */
public class Algorithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = s.nextLine();

        Set<Character> sc = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            sc.add(c);
            if(sc.size()!=(i+1)){
                System.out.println(c);
            }
        }
    }
}
//1. 猫shi咖啡*14  安慕希 *10
//2.    屈臣氏苏打水330ml*24 水果坚果脆0.6kg 甘蔗汁*6
//3.    元气深林*15 纯牛奶*12 马蹄爽12
//4.    八宝粥24 饮料12
