package assignments.MethodOverloading.ex2;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("rudra");
        Person person2=new Person("basil",23);
        Person person3=new Person("joseph",24,"Chennai");
        System.out.println(person3.name);
        System.out.println(person2.age);
        System.out.println(person1.name);
    }
}
