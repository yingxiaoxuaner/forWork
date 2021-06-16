package com.qiyi.test;

/**
 * 如果你需要通过计算来初始化你的static变量，你可以声明一个static块，Static 块仅在该类被加载时执行一次。
 * 一旦UseStatic 类被装载，所有的static语句被运行。首先，类属性变量开始赋值，a被设置为3，b默认初始化为 0 ，
 * 接着运行static 块，执行（打印一条消息），最后，b被初始化为a*4 或12。然后调用main（），main() 调用meth() ，把值42传递给x。
 *
 * 3个println () 语句引用两个static变量a和b，以及局部变量x。
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
