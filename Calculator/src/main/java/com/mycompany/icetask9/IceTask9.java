/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask9;
import java.util.Scanner;
//import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class IceTask9 {
    //Value returning methods to return the operations between x and y (the numbers that users input)
    public int addition(int x, int y){
        return x + y;
    }
    
    public int subtraction(int x, int y){
        return x - y;
    }

    public int multiplication(int x, int y){
        return x * y;
    }
    
    public int division(int x, int y){
        return x / y;
    }
    
    public static void main(String[] args) {
        //Create an instance of the class
        IceTask9 taskclass = new IceTask9();
        
        //Create the object for the scanner. For user input
        Scanner input = new Scanner(System.in);
        
        //initialize result at zero
        int result = 0;
        
        //Prompt user for input with JOptionPane to display a message asking for user input        System.out.println("Please enter the first number: ");
        String userInput1 = JOptionPane.showInputDialog(null, "Please enter yout first number");
        int x = Integer.parseInt(userInput1);
        
        String userInput2 = JOptionPane.showInputDialog(null, "Please enter your second number");
        int y = Integer.parseInt(userInput2);
        
        //JOptionPane to display a message asking for user input
        String menu = "Calculator:\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + "0. Exit App\n";
        
        String optionInput = JOptionPane.showInputDialog(menu);
        int option = Integer.parseInt(optionInput);
        
        while (option != 0){
            //Switch case statement to process the users inputs (operation selection and numbers)
            switch (option) {
            case 1:
                result = taskclass.addition(x, y);
                break;
            case 2:
                result = taskclass.subtraction(x, y);
                break;
            case 3:
                result = taskclass.multiplication(x, y);
                break;
            case 4:
                result = taskclass.division(x, y);
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Exiting");
            default:
                System.out.println("Calculation not recognized. Please try again");
                break;
            }
            
            //Display outputs
            int answer = result;
            JOptionPane.showMessageDialog(null, "The answer is " + answer, "Result", JOptionPane.INFORMATION_MESSAGE);
            
            userInput1 = JOptionPane.showInputDialog(null, "Please enter yout first number");
            x = Integer.parseInt(userInput1);
            
            userInput2 = JOptionPane.showInputDialog(null, "Please enter your second number");
            y = Integer.parseInt(userInput2);
            
            menu = "Calculator:\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + "5. Exit\n";
            
            optionInput = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionInput);
            
            /*
            if (option == 1){
                taskclass.addition(x, y);
            } else if (option == 2){
                taskclass.subtraction(x, y);
            } else if (option == 3){
                taskclass.multiplication(x, y);
            } else if (option == 4){
                taskclass.division(x, y);
            } else {
                System.out.println("Calculation not recognized");
            }
            */           
            }
            
    }
}
