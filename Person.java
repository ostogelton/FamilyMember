package project;

public class Person {
    String name;
    int age;
    String position;
    int id = 0;
    
    Person(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }
    
    
    public void displayInfo(){
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Position: " + position);
    
    }
    
}
