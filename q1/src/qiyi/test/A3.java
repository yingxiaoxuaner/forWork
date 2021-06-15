package qiyi.test;

/**
 * super使用实例1
 * 当在父类中定义了有参构造函数，都是没有定义无参构造函数时，IDE会强制要求我们定义一个相同参数类型的构造器。
 * JVM默认给B加了一个无参构造方法，而在这个方法中默认调用了super()，但是父类中并不存在该构造方法
 * 所以只能给B加一个有参数的构造函数啦
 */
public class A3 {
    public A3(String s) {

    }


}

class B2 extends A3{
    public B2(String s) {
      super(s);

    }
}