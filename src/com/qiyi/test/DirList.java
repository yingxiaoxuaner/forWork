package com.qiyi.test;

import java.io.File;

public class DirList {
    public static void main(String args[]) {
        String dirname = "Y:/forWork";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Ŀ¼ " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " ��һ��Ŀ¼");
                } else {
                    System.out.println(s[i] + " ��һ���ļ�");
                }
            }
        } else {
            System.out.println(dirname + " ����һ��Ŀ¼");
        }
    }
}