package qiyi.test;

/**
 * ��ֵ�ı仯��������������õı仯��str1ָ��������һ���¶��󣡶�str2�Ծ�ָ��ԭ���Ķ���
 * �����ǽ�str1��ֵ��Ϊ"bcd"ʱ��JVM������ջ��û�д�Ÿ�ֵ�ĵ�ַ���㿪���������ַ����������һ���µĶ������ַ�����ֵָ�������ַ��
 * �����ַ��������������ö��Ǵ洢��ջ�еģ�����Ǳ������Ѿ�������(ֱ����˫���Ŷ����)�ľʹ洢�ڳ�������.
 * ����������ڣ�new�����ģ�����ȷ���ľʹ洢�ڶ��С�
 * ����equals��ȵ��ַ������ڳ���������Զֻ��һ�ݣ��ڶ����ж�ݡ�
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
