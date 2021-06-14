package qiyi.test;

/**
 * IntegerCache会缓存-128~127之间的对象 2200大于该范围
 * 所以创建新对象返回，即在堆中新分配了内存，引用变量的地址改变
 * 非new生成的Integer变量和new Integer()生成的变量比较时，结果为false。
 * （因为非new生成的Integer变量指向的是java常量池中的对象，而new Integer()生成的变量指向堆中新建的对象，两者在内存中的地址不同）
 */
public class Test4 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        Integer m = new Integer(2200);
        Integer n = new Integer(2200);
        System.out.println(i == j); //false
        System.out.println(i == 100); //true
        System.out.println(m == 2200); //true
        System.out.println(m == n); //false
        Integer a = new Integer(120);
        Integer b = 120;
        System.out.println(a == b); //false

    }

}
