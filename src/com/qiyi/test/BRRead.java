package com.qiyi.test;
import java.io.*;

/**
 *�ӿ���̨��ȡ���ַ�����
 * Java �Ŀ���̨������ System.in ��ɡ�
 * Ϊ�˻��һ���󶨵�����̨���ַ���������԰� System.in ��װ��һ�� BufferedReader ������������һ���ַ�����
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        // ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�����ַ�, ���� 'q' ���˳���");
        // ��ȡ�ַ�
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}