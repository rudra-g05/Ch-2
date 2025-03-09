class Dog{
    String name;
    String bread;
    int age;
    int size;

    void bark(){
        System.out.println("Ruff..... Ruff.....");
    }
    void roll(){
        System.out.println(" Rolling on Ground...");

    }
    void ball(){
        System.out.println("bhaoo... here is th ball master");
    }
}

public class DogTest{
    public static void main (String[] args){

        Dog d = new Dog();

        d.name = "Puck";
        d.bread= "idk";
        d.age= 5;
        d.size = 30;

        d.bark();
        d.ball();
        d.roll();

        System.out.println("My name is "+ d.name + " from " + d.bread+" bread and age,size are "+ d.age + ", " + d.size +" respectively.");
    }
}