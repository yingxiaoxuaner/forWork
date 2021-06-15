package qiyi.test;

/**
 * super()的使用实例2
 * 子类重写父类的变量
 */
public class A1 {

    String nameA="A";

}

class B1 extends A1{
    String nameA="B";


    public void getName() {
        System.out.println("子类"+nameA);
        System.out.println("父类"+super.nameA);
    }

    public static void main(String[] args) {
        B1 b=new B1();
        b.getName();

    }
}