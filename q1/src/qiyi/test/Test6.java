package qiyi.test;

/**
 * 如果该实例在常量池中首次出现，只是在常量池中记录该实例引用.
 * 因此intern返回的引用和原来StringBuilder创建的字符串实例是同一个.
 * 对于第二个Str2，因为StringBuilder创建的最终创建的"java"已经在StringBuilder.toString之前在常量池中出现过，所以不是首次出现，
 * intern就会直接返回在常量池中的实例引用，而StringBuilder创建的是在堆内存中新的实例，因此两者不想等。
 */
public class Test6 {
    public static void main(String[] args) {
        String str = new StringBuilder("11").append("va").toString();//这种不会在常量池开辟空间存11va
        System.out.println(str.intern() == str);

        System.out.println("---------------------");

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
        String str1 = new StringBuilder("111").append("va").toString();
        System.out.println(str1.intern() == str1);

        System.out.println("---------------------");

        String str3 = new String("xxxs");//引号部分"xxxs"已经先在常量池中开辟空间存储了，然后再是在堆中存储,intern返回的是常量池中实例的引用，自然和堆中的引用不同，因此是false.
        System.out.println(str3.intern() == str3);
        System.out.println("---------------------");

        String str20 = "SEUCalvin";//新加的一行代码，其余不变


        String str10 = new String("SEU")+ new String("Calvin");

        System.out.println(str10.intern() == str20);

        System.out.println(str10 == "SEUCalvin");

    }
}
