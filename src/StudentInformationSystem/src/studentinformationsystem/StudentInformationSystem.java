/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author user
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "SYED AKIL IKMAL BIN SYED ADAM MAT NAWEE";
        String studentId = "S87081";

        // Two marks stored in variables
        int mark1 = 45;
        int mark2 = 40;

        // Calculate total
        int total = mark1 + mark2;

        // Display details
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        // Message based on total
        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
