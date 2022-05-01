package Salary;
import java.util.Scanner;

public class EmployeeSalary
{
     public static void main(String[] args)
     {
     Scanner s = new Scanner(System.in);
         System.out.println("Enter employee name :");
         String name = s.next();
         System.out.println("Enter date of birth :");
         int dob = s.nextInt();
         System.out.println("Enter birth month :");
         int month = s.nextInt();
         System.out.println("Enter birth year");
         int year = s.nextInt();
         System.out.println("Enter monthly employee salary :");
         float salary = s.nextFloat();

         float annualSalary= salary*12;
         float a=100000;
         int age = 2020-year;
         float tax;

         System.out.println("EMPLOYEE SALARY DETAILS");
         System.out.println("-------------------------");
         System.out.println("Employee name:"+name);
         System.out.println("Employeee age:"+age);
         System.out.println("Employee annual salary:"+annualSalary);
         if(annualSalary>5*a)
         {
             tax = annualSalary * 20 / 100;
             System.out.println("Employee has to pay tax :" + tax);
         }
         else if(annualSalary>4*a)
         {
             tax = annualSalary * 15 / 100;
             System.out.println("Employee has to pay tax :" + tax);
         }
         else if (annualSalary>3*a)
         {
             tax = annualSalary * 10 / 100;
             System.out.println("Employee has to pay tax :" + tax);
         }
         else if (annualSalary>2*a)
             {
             tax = annualSalary * 5 / 100;
             System.out.println("Employee has to pay tax :" + tax);
             }
         else
         {
             System.out.println("Emplyee has to pay no tax");
         }
     }
}
