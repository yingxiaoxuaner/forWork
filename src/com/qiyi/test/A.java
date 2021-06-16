package com.qiyi.test;

/**
 * super使用实例1
 * 子类重写父类的方法
 */
public class A {

    private String nameA="A";

    public void getName() {
        System.out.println("父类"+nameA);
    }

}


class B extends A{
    private String nameB="B";

    @Override
    public void getName() {
        System.out.println("子类"+nameB);
        super.getName();
    }

    public static void main(String[] args) {
        B b=new B();
        b.getName();

    }
}


