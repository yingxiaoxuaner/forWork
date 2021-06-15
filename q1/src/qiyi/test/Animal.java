package qiyi.test;

/**
 * 多态继承封装样例
 */

public class Animal { // 动物
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.sleep();
        Animal horse1 = new Horse();
        horse1.sleep();
        Animal horse2 = new Animal();
        horse2.sleep();

    }
    public void sleep() {
        System.out.println("躺着睡");
    }
}
class Horse extends Animal { // 马 是一种动物，继承
    public void sleep() {  //重写，多态
        System.out.println("站着睡");
        super.sleep(); //调用父类sleep方法

    }
}
class Cat extends Animal { // 猫 是一种动物
    private int age; //封装
    public int getAge() {
        return age + 1;
    }
    @Override
    public void sleep() {
        System.out.println("四脚朝天的睡");
    }
}