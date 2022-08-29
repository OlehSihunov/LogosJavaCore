package Lesson7;

public class Lesson7 { // private protected default-
    public static void main(String[] args) {
        Dog larry = new Dog("Larry","labrador", 2);
        Dog loki = new Dog("Loki", "Koli",1 );
        Cat genry = new Cat();
        genry.name = "genry";
        genry.eat();
        genry.sleep();
        Dog puppy = new Dog();
        puppy.name = "Sharik";
        puppy.age = -10;
        puppy.getType();
        puppy.setType("Koli");
        loki.getInfo();
        larry.getInfo();
        puppy.getInfo();
    }
}
