package Lesson7;

public class Dog {
    public String name; //default
    private String type;
    protected int weight;
    int age;

    public  Dog() {
        weight = 100;
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            this.age = 0;
        }else {
        this.age = age;
        }
    }

    public String getType() {
        return  type;
    }

    public void setType(String newType) {
        type= newType;
    }
    public Dog(String _name, String _type, int _age) {
        name = _name;
        type = _type;
        age = _age*5;
        type = "fdsfsdfdsfds";
    }
    public void bark() {
        System.out.println(name + "Woof!");
    }

    public void eat(int mealWeight) {
        weight += mealWeight;
        System.out.println("New weight: "+ weight);
        type = "1212";
    }

    public void getInfo() {
        System.out.println("*****************************");
        System.out.println("Name: "+ name);
        System.out.println("Weight: "+ weight);
        System.out.println("Type: "+ type);
        System.out.println("Age: "+ age);
        System.out.println("*****************************");
    }
}
