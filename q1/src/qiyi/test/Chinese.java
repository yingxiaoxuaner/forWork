package qiyi.test;

/**
 * super() �� this() ������ڹ��췽���ڵ�һ�С�
 * super() �� this() ����,�����ǣ�super() �������е��ø���Ĺ��췽����this() ��ͬһ���ڵ�������������
 * his �� super ����ͬʱ������һ�����캯�����棬��Ϊthis��Ȼ����������Ĺ��캯����
 * �����Ĺ��캯����ȻҲ���� super ���Ĵ��ڣ�������ͬһ�����캯����������ͬ����䣬��ʧȥ���������壬������Ҳ����ͨ����
 * �ӱ����Ͻ���this ��һ��ָ�򱾶����ָ��, Ȼ�� super ��һ�� Java �ؼ��֡�
 */
class Person {
    public static void prt(String s) {
        System.out.println(s);
    }

    Person() {
        prt("���ࡤ�޲������췽���� "+"A Person.");
    }//���췽��(1)

    Person(String name) {
        prt("���ࡤ��һ�������Ĺ��췽���� "+"A person's name is " + name);
    }//���췽��(2)
}

public class Chinese extends Person {
    Chinese() {
        super(); // ���ø��๹�췽����1��
        prt("���ࡤ���ø��ࡰ�޲������췽������ "+"A chinese coder.");
    }

    Chinese(String name) {
        super(name);// ���ø��������ͬ�βεĹ��췽����2��
        prt("���ࡤ���ø��ࡰ��һ�������Ĺ��췽������ "+"his name is " + name);
    }

    Chinese(String name, int age) {
        this(name);// ���þ�����ͬ�βεĹ��췽����3��
        prt("���ࣺ�������������ͬ�βεĹ��췽����his age is " + age);
    }

    public static void main(String[] args) {
       // Chinese cn = new Chinese();
       // Chinese cn = new Chinese("codersai");
       Chinese cn = new Chinese("codersai", 18);
    }
}