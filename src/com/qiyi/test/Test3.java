package com.qiyi.test;
/**
 * ����Integer��ʹ�ã���java11Ӧ���Ѿ�������Integer����������
 * ��Java SE5��ʼ���ṩ���Զ�װ�����������ԡ�װ������Զ���������������ת��Ϊ��װ�����ͣ��������Զ�����װ������ת��Ϊ������������
 *
 */
public class Test3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 3;
        Integer i = Integer.valueOf(100);
        Integer j = new Integer(200);
        System.out.println(a==i);//�Զ����װΪint��
        System.out.println(i.equals(a));//�Զ���װΪInteger��
        System.out.println(b==j);
    }
}
