package domain;


 /**
 * The class Octofregoton extends predator
 */ 
public class Octofregoton extends Predator {

    private String clasification;


/** 
 *
 * Octofregoton
 *
 * @param name  the name
 * @param age  the age
 * @param weight  the weight
 * @param height  the height
 * @param clasification  the clasification
 * 
 */
    public Octofregoton(String name, int age, int weight, int height, String clasification) { 

     this.name=name;
     this.age=age;
     this.weight=weight;
     this.clasification=clasification;
    }


/** 
 *
 * Octofregoton
 *
 * 
 */
    public Octofregoton() { 

        this("Blepik", 658, 14561, 3,  "just an avarage Octofregoton");
    }


/** 
 *
 * Octofregoton
 *
 * @param name  the name
 * @return public
 */
    public Octofregoton(String name) { 

        this(name, 658, 14586, 3,  "just an avarage Octofregoton" );
    }

        

/** 
 *
 * Playwithhumans
 *
 */
    public void playwithhumans() { 

        System.out.println("Octofregaton playing with humans...");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Octofregoton hunting humans..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nClassification:\t"+this.clasification+"\n\nThis is Octofregoton!";
    }

    @Override

/** 
 *
 * Drink
 *
 */
    public void drink() { 

        System.out.println("Octofregoton drinking blood..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Octofregoton Grrrrrrr..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("octofregoton eating humans...."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
