# Java05-面向对象基础

## **Task1.对象和类**

### 1.Person类

```java
//第四题的代码不是这个
public class Person {
    private String name;
    private int age;
    private int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.sex = other.sex;
    }

    private void eat() {
        System.out.println(name + " 正在吃东西");
    }

    private void sleep() {
        
    }

    private void dadoudou() {
        
    }
}
```

* `this`:成员函数的一个特殊的本地变量，表达调用了这个函数的那个对象。因此可以用于引用当前对象的字段，帮助区分类的字段和参数，确保正确赋值。

### 2主类

```java
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, 1); 
        Person person2 = new Person(person1); 
    }
}
```

* 类是规范，是创建对象的蓝图，对象则是类的实例。如果说类规范了猫，那么类的一个对象就可以看作是一只猫。

* 类定义了对象的属性（字段）和行为（方法），描述了一组具有共同特征的对象。

  每个对象独立地具有类定义的属性和方法。

* 对象封装了数据和操作这些数据的方法，外部代码通过接口（方法）与对象交互，而不直接访问其内部状态。

### 3.访问修饰符

* **private**：仅在类内部可访问。

* **default**（无修饰符）：在同一包内可访问。

* **protected**：在同一包及子类中可访问。

* **public**：可以在任何地方访问。

## **Task2.类中的变量和方法**

### 4.返回对象数

见附件

