public class Person {
    private String name;
    private int age;
    private int sex;

    private static int count = 0;

    // 创建对象时增加计数
    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        count++;
    }
    public Person() {
        count++;
    }
    public Person(Person other){//复制一个Person的对象other
        this.name = other.name;
        this.age = other.age;
        this.sex = other.sex;
        count++;
    }

    // 释放对象时手动调用
    public static void whenfree(){
        count--; // 当对象被垃圾回收时减少计数
    }

    // 返回当前存在的对象数量
    public static int getcount() {
        return count;
    }

    private void eat() {
        System.out.println(name+"正在吃东西");
    }

    private void sleep() {
        System.out.println(age+"岁了，你这个年纪怎末睡得着的。");
    }

    private void dadoudou() {
        System.out.println(" ");
    }
}