package com.qiyi.test;

/**
 * lambda���ʽ��Ӧ��
 */
//��ע����������ֻ����һ�����󷽷�
@FunctionalInterface
public interface Usb {
    void work(String str);
}
class TestUsb{
    public static void main(String[] args) {
        Usb usb = s ->System.out.println(s + "�����ˣ�");//lambda���ʽһ����������ʡ��()
        usb.work("qiyi");
    }
}