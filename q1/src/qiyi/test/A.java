package qiyi.test;

/**
 * superʹ��ʵ��1
 * ������д����ķ���
 */
public class A {

    private String nameA="A";

    public void getName() {
        System.out.println("����"+nameA);
    }

}


class B extends A{
    private String nameB="B";

    @Override
    public void getName() {
        System.out.println("����"+nameB);
        super.getName();
    }

    public static void main(String[] args) {
        B b=new B();
        b.getName();

    }
}


