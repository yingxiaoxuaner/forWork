package com.qiyi.test;

/**
 * IntegerCache�Ỻ��-128~127֮��Ķ��� 2200���ڸ÷�Χ
 * ���Դ����¶��󷵻أ����ڶ����·������ڴ棬���ñ����ĵ�ַ�ı�
 * ��new���ɵ�Integer������new Integer()���ɵı����Ƚ�ʱ�����Ϊfalse��
 * ����Ϊ��new���ɵ�Integer����ָ�����java�������еĶ��󣬶�new Integer()���ɵı���ָ������½��Ķ����������ڴ��еĵ�ַ��ͬ��
 */
public class Test4 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        Integer m = new Integer(2200);
        Integer n = new Integer(2200);
        System.out.println(i == j); //false
        System.out.println(i == 100); //true
        System.out.println(m == 2200); //true
        System.out.println(m == n); //false
        Integer a = new Integer(120);
        Integer b = 120;
        System.out.println(a == b); //false

    }

}
