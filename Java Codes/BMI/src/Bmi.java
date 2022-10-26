import javax.swing.*;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {


        System.out.println("------------------------------BMI Calculator-----------------------------------------------");


        // Get and print Height-------------------------------------------
        int Height = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Enter Your Height"));

        System.out.println("Your Height is:" + Height);


        // Get and print Weight-------------------------------------------
        int Weight = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Enter Your Weight));

        System.out.println("Your Weight  is:" + Weight);


        //Calculate part---------------------------------------------------
        int BMI;
        BMI = Weight / (Height * Height);
        System.out.println("Your BMI Value is:" + BMI);


        //End part--------------------------------------------------------
        System.out.println("Thank your !");


    }


}