package qiyi.test;

/**
 * ��̬�̳з�װ����
 */

public class Animal { // ����
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.sleep();
        Animal horse1 = new Horse();
        horse1.sleep();
        Animal horse2 = new Animal();
        horse2.sleep();

    }
    public void sleep() {
        System.out.println("����˯");
    }
}
class Horse extends Animal { // �� ��һ�ֶ���̳�
    public void sleep() {  //��д����̬
        System.out.println("վ��˯");
        super.sleep(); //���ø���sleep����

    }
}
class Cat extends Animal { // è ��һ�ֶ���
    private int age; //��װ
    public int getAge() {
        return age + 1;
    }
    @Override
    public void sleep() {
        System.out.println("�Ľų����˯");
    }
}