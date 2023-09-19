
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caleb
 */
public class ClassOneParcial {

    private static Object integer;
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        String studentOne [] = new String [3]; 
        String studentTwo [] = new String [3]; 
        String studentThree [] = new String [3];
        int ages [] = new int [3];


            System.out.println("enter the name of the student");
            studentOne [0] = read.nextLine();
            System.out.println("enter the document of the student");
            studentOne [1] = read.nextLine();
            System.out.println("enter the age of the student");
            studentOne [2] = read.nextLine();
            System.out.println("enter the name of the student");
            studentTwo [0] = read.nextLine();
            System.out.println("enter the document of the student");
            studentTwo [1] = read.nextLine();
            System.out.println("enter the age of the student");
           studentTwo [2] = read.nextLine();
            System.out.println("enter the name of the student");
            studentThree [0] = read.nextLine();
            System.out.println("enter the document of the student");
            studentThree [1] = read.nextLine();
            System.out.println("enter the age of the student");
            studentThree [2] = read.nextLine();
            
            ages [0]  = Integer.parseInt(studentOne[2]);
            ages [1]  = Integer.parseInt(studentTwo[2]);
            ages [2]  = Integer.parseInt(studentThree[2]);
            
            int counter =0;
            int acumulador = 0;
            for (int age : ages){
                counter += age;
                acumulador ++;
            }
            System.out.println("el promedio es de "+counter/acumulador+" años");
    }
}
