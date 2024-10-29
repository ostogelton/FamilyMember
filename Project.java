package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Project {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        ArrayList<Person> person = new ArrayList<Person>();
        int opt;
        int n = 0;
        
        
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
            System.out.println("[1]Add\n[2]Delete\n[3]Edit\n[4]Print\n[5]Exit: ");
            opt = scann.nextInt();
        
            switch(opt){
                case 1:
                    System.out.println("====================================");
                    System.out.print("Name:    ");
                    scann.nextLine();
                    String name = scann.nextLine();
                    
                    System.out.print("Age:     ");
                    int age = Integer.parseInt(reader.readLine());
                    
                    System.out.print("Position:");
                    String position = scann.nextLine();
                    System.out.println("====================================");
                        
                    person.add(new Person(name,age,position));
                    JOptionPane.showMessageDialog(null, "Successfully Saved", "Saved", JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 2:
                    System.out.println("====================================");
                        
                    System.out.print("Enter the Id you want to delete: ");
                    int del = Integer.parseInt(reader.readLine());
                    
                    System.out.print("Do you want to Delete y/N: ");
                    char choice = scann.next().charAt(0);
                    
                    
                    if(choice == 'y'){
                    person.remove(del);
                    JOptionPane.showMessageDialog(null, "Susccessfully Deleted", "Delete", JOptionPane.WARNING_MESSAGE);
                    System.out.println("====================================");
                    }
                    
                    break;
                case 3:
                    System.out.println("====================================");
                    System.out.print("Enter the Id you want to Edit: ");
                    int edit = Integer.parseInt(reader.readLine());
                    scann.nextLine();
                    System.out.print("Enter the Name: ");
                    String Ename = scann.nextLine();
                    System.out.print("Enter the Age: ");
                    int Eage = Integer.parseInt(reader.readLine());
                    System.out.print("Enter the Position: ");
                    String Eposition = scann.nextLine();
                    System.out.println("====================================");
                        
                    
                    person.set(edit, new Person(Ename,Eage,Eposition));
                    break;
                case 4:
                    System.out.println("-------List of Family Members----------");
                    for(Person p : person){
                        System.out.println("====================================");
                        p.displayInfo();
                        System.out.println("====================================");
                        
                    }
                    break;
                case 5:
                    System.out.println("========Exit=======");
                    System.exit(0);
                    break;
                }
            }
        
        }catch(Exception e){
            System.out.println("Wrong Credintials");
        }
        
        
        
        
    }
    
}
