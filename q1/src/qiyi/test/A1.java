package qiyi.test;

/**
 * super()��ʹ��ʵ��2
 * ������д����ı���
 */
public class A1 {

    String nameA="A";

}

class B1 extends A1{
    String nameA="B";


    public void getName() {
        System.out.println("����"+nameA);
        System.out.println("����"+super.nameA);
    }

    public static void main(String[] args) {
        B1 b=new B1();
        b.getName();

    }
}