package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int age;

    protected int weight;

    protected int height;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        
        name="generic animal";
        age=127;
        weight=1377;
        height=3;
                
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println ("Animal eating...");
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking...");
    }


/** 
 *
 * Drink
 *
 */
    public void drink() { 

    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal{" + "\name:\t" + name + "\nage:\t" + age + "\nweight:\t" + weight + "\nheight:\t" + height + '}';
    }

   
}
