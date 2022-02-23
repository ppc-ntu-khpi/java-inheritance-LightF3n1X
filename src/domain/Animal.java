package domain;

public class Animal {

    protected String name;

    protected int age;

    protected int weight;

    protected int height;

    public Animal() {
        
        name="generic animal";
        age=127;
        weight=1377;
        height=3;
                
    }

    public void eat() {
        System.out.println ("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    public void drink() {
    }

    @Override
    public String toString() {
        return "Animal{" + "\name:\t" + name + "\nage:\t" + age + "\nweight:\t" + weight + "\nheight:\t" + height + '}';
    }

   
}
