package com.qiyi.test;

import java.io.*;

/**
 * ÿ�ε��� read() ������������������ȡһ���ַ����Ѹ��ַ���Ϊ����ֵ���ء� ����������ʱ�򷵻� -1���÷����׳� IOException��
 * ÿ�ε��� read() ������������������ȡһ���ַ����Ѹ��ַ���Ϊ����ֵ���ء� ����������ʱ�򷵻� -1���÷����׳� IOException��
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        // ʹ�� System.in ���� BufferedReader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}