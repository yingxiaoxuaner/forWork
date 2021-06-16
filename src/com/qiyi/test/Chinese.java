package com.qiyi.test;

/**
 * super() 和 this() 均需放在构造方法内第一行。
 * super() 和 this() 类似,区别是，super() 从子类中调用父类的构造方法，this() 在同一类内调用其它方法。
 * his 和 super 不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，
 * 其它的构造函数必然也会有 super 语句的存在，所以在同一个构造函数里面有相同的语句，就失去了语句的意义，编译器也不会通过。
 * 从本质上讲，this 是一个指向本对象的指针, 然而 super 是一个 Java 关键字。
 */
class Person {
    public static void prt(String s) {
        System.out.println(s);
    }

    Person() {
        prt("父类·无参数构造方法： "+"A Person.");
    }//构造方法(1)

    Person(String name) {
        prt("父类·含一个参数的构造方法： "+"A person's name is " + name);
    }//构造方法(2)
}

public class Chinese extends Person {
    Chinese() {
        super(); // 调用父类构造方法（1）
        prt("子类·调用父类“无参数构造方法”： "+"A chinese coder.");
    }

    Chinese(String name) {
        super(name);// 调用父类具有相同形参的构造方法（2）
        prt("子类·调用父类“含一个参数的构造方法”： "+"his name is " + name);
    }

    Chinese(String name, int age) {
        this(name);// 调用具有相同形参的构造方法（3）
        prt("子类：调用子类具有相同形参的构造方法：his age is " + age);
    }

    public static void main(String[] args) {
       // Chinese cn = new Chinese();
       // Chinese cn = new Chinese("codersai");
       Chinese cn = new Chinese("codersai", 18);
    }
}