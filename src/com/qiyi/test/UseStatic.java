package com.qiyi.test;

/**
 * �������Ҫͨ����������ʼ�����static���������������һ��static�飬Static ����ڸ��౻����ʱִ��һ�Ρ�
 * һ��UseStatic �౻װ�أ����е�static��䱻���С����ȣ������Ա�����ʼ��ֵ��a������Ϊ3��bĬ�ϳ�ʼ��Ϊ 0 ��
 * ��������static �飬ִ�У���ӡһ����Ϣ�������b����ʼ��Ϊa*4 ��12��Ȼ�����main������main() ����meth() ����ֵ42���ݸ�x��
 *
 * 3��println () �����������static����a��b���Լ��ֲ�����x��
 */
public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String args[]) {
        meth(42);
    }

}
