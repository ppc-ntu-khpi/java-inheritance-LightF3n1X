package domain;

public class Octofregoton extends Predator {

    private String clasification;

    public Octofregoton(String name, int age, int weight, int height, String clasification) {
     this.name=name;
     this.age=age;
     this.weight=weight;
     this.clasification=clasification;
    }

    public Octofregoton() {
        this("Blepik", 658, 14561, 3,  "just an avarage Octofregoton");
    }

    public Octofregoton(String name) {
        this(name, 658, 14586, 3,  "just an avarage Octofregoton" );
    }

        
    public void playwithhumans() {
        System.out.println("Octofregaton playing with humans...");
    }

    @Override
    public void hunt() {
        System.out.println("Octofregoton hunting humans..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+"\nClassification:\t"+this.clasification+"\n\nThis is Octofregoton!";
    }

    @Override
    public void drink() {
        System.out.println("Octofregoton drinking blood..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void speak() {
        System.out.println("Octofregoton Grrrrrrr..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void eat() {
        System.out.println("octofregoton eating humans...."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
