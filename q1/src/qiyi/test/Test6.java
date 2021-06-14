package qiyi.test;

/**
 * �����ʵ���ڳ��������״γ��֣�ֻ���ڳ������м�¼��ʵ������.
 * ���intern���ص����ú�ԭ��StringBuilder�������ַ���ʵ����ͬһ��.
 * ���ڵڶ���Str2����ΪStringBuilder���������մ�����"java"�Ѿ���StringBuilder.toString֮ǰ�ڳ������г��ֹ������Բ����״γ��֣�
 * intern�ͻ�ֱ�ӷ����ڳ������е�ʵ�����ã���StringBuilder���������ڶ��ڴ����µ�ʵ����������߲���ȡ�
 */
public class Test6 {
    public static void main(String[] args) {
        String str = new StringBuilder("11").append("va").toString();//���ֲ����ڳ����ؿ��ٿռ��11va
        System.out.println(str.intern() == str);

        System.out.println("---------------------");

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
        String str1 = new StringBuilder("111").append("va").toString();
        System.out.println(str1.intern() == str1);

        System.out.println("---------------------");

        String str3 = new String("xxxs");//���Ų���"xxxs"�Ѿ����ڳ������п��ٿռ�洢�ˣ�Ȼ�������ڶ��д洢,intern���ص��ǳ�������ʵ�������ã���Ȼ�Ͷ��е����ò�ͬ�������false.
        System.out.println(str3.intern() == str3);
        System.out.println("---------------------");

        String str20 = "SEUCalvin";//�¼ӵ�һ�д��룬���಻��


        String str10 = new String("SEU")+ new String("Calvin");

        System.out.println(str10.intern() == str20);

        System.out.println(str10 == "SEUCalvin");

    }
}
