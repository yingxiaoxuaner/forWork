package com.qiyi.offer.q2;

/**
 * 字符数组替换方法
 */
public class S2{
    public String replaceSpace(String s){
        if(s == null){ return null; }
        StringBuffer str = new StringBuffer(s);
        int length = str.length();
        int spaceNum = 0;
        for(int i = 0;i < length;i++){    if(str.charAt(i) == ' '){ spaceNum++; } }

        int oldStr = length - 1;
        length += 2 * spaceNum;
        int newStr = length - 1;
        str.setLength(length);
        while(spaceNum > 0 && newStr >= 0){
            char ch = str.charAt(oldStr--);
            if(ch == ' '){
                str.setCharAt(newStr--,'0');
                str.setCharAt(newStr--,'2');
                str.setCharAt(newStr--,'%');
                spaceNum--;
            }
            else{ str.setCharAt(newStr--,ch); }
        }

        return str.toString();
    }
}