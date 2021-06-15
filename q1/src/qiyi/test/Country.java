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
        super.value();      //调用父类的方法
        System.out.println(name);
        System.out.println(super.name);//若不调用父类方法 value()，只调用父类变量 name 的话，则父类 name 值为默认值 null。
    }

    public static void main(String[] args) {
        City c=new City();
        c.value();
    }
}