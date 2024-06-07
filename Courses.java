/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.balex;

/**
 *
 * @author hi
 */
import java.util.Scanner;

public class Courses{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course ID:");
        String courseId = scanner.next();
        
        if (courseId.equals("BSE")) {
            System.out.println("Course ID: BSE");
            System.out.println("Course Name: Software Engineering");
            System.out.println("Course Fee: 900,000");
            
        } else if (courseId.equals("BIT")) {
            System.out.println("Course ID: BIT");
            System.out.println("Course Name: Information Technology");
            System.out.println("Course Fee: 750,000");
            
        } else if (courseId.equals("BCS")) {
            System.out.println("Course ID: BCS");
            System.out.println("Course Name: Computer Science");
            System.out.println("Course Fee: 800,000");
            
        } else if (courseId.equals("BCE")) {
            System.out.println("Course ID: BCE");
            System.out.println("Course Name: Computer Engineering");
            System.out.println("Course Fee: 950,000");
            
        } else {
            System.out.println("Wrong CourseID details");
        }
    }
}

   


    