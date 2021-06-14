package qiyi.test;

/**
 * 赋值的变化导致了类对象引用的变化，str1指向了另外一个新对象！而str2仍旧指向原来的对象。
 * 当我们将str1的值改为"bcd"时，JVM发现在栈中没有存放该值的地址，便开辟了这个地址，并创建了一个新的对象，其字符串的值指向这个地址。
 * 对于字符串：其对象的引用都是存储在栈中的，如果是编译期已经创建好(直接用双引号定义的)的就存储在常量池中.
 * 如果是运行期（new出来的）才能确定的就存储在堆中。
 * 对于equals相等的字符串，在常量池中永远只有一份，在堆中有多份。
 */
public class Test5 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        str1 = "bcd";
        System.out.println(str1 + "," + str2); //bcd, abc
        System.out.println(str1==str2); //false
    }
}
