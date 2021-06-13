package qiyi.test;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试字符串转为字符数组的toCharArray方法
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "helloworld";
        char[] c = a.toCharArray();
        for(char x :c){
            System.out.println(x);}
        System.out.println(c.length);
        System.out.println(a.length());
        List<Object> array=new ArrayList();
        array.add(a);
        System.out.println(array);
    }
}

