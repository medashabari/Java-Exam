package studentmarks;
import java.util.Scanner;

public class Calculatingpercentage {
     public static void main(String[] args) {

          System.out.println("DAY-3 ASSIGNMENT-1");
          System.out.println("--------------------");
          Scanner sc = new Scanner(System.in);
          int maths, physics, chemistry, english, computer;
          float total,percentage;
          System.out.println("STUDENT MARKS INFO");
          System.out.println("--------------------");
          System.out.println("Enter student name");
          String name = sc.next();
          System.out.println("Enter maths marks");
          maths = sc.nextInt();
          System.out.println("Enter physics marks");
          physics = sc.nextInt();
          System.out.println("Enter chemisty marks");
          chemistry = sc.nextInt();
          System.out.println("Enter english marks");
          english = sc.nextInt();
          System.out.println("Enter computer marks");
          computer = sc.nextInt();

           total = maths + physics + chemistry + english + computer;
          percentage = (total/500)*100;
          System.out.println("Student name :" + name);
          System.out.println("total marks :" + total);
          System.out.println("percentage:" + percentage);
          if (percentage >= 80) {
               System.out.println("Your grade is A and percentage is" + percentage);
          } else if (percentage >= 60 && percentage <= 79)
          {
               System.out.println("Your grade is B and percentage is" + percentage);
          }
          else if(percentage>=35 && percentage<=59)
          {
               System.out.println("Your grade is c and percentage is"+percentage);
          }
          else
               System.out.println("Your are failed and percentage is"+percentage);
          System.out.println("study well and better luck next time");
     }
}
