package qiyi.test;

/**
 *
 */
class Country {
    String name;
    void value() {
        name = "China";
    }
}

class City extends Country {
    String name;
    void value() {
        name = "Shanghai";
        super.value();      //���ø���ķ���
        System.out.println(name);
        System.out.println(super.name);//�������ø��෽�� value()��ֻ���ø������ name �Ļ������� name ֵΪĬ��ֵ null��
    }

    public static void main(String[] args) {
        City c=new City();
        c.value();
    }
}