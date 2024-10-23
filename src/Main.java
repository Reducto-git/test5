public class Main {
    public static void main(String[] args) {
        String name="成小电";
        int age=18;
        int sex=1;
        Person p1=new Person(name,age,sex);
        Person p2= new Person(p1);

        System.out.println(Person.getcount());

        p1=null;
        Person.whenfree();
        System.out.println(Person.getcount());
    }
}