import java.util.Scanner;
public class Avengers
{
    Scanner c = new Scanner(System.in);
    String name,power,weapon,planet = new String();
    int age;

    public void getDetails()
    {
        System.out.println("Enter avenger name :");
        name = c.next();
        System.out.println("Enter avenger age :");
        age = c.nextInt();
        System.out.println("Enter avenger power:");
        power = c.next();
        System.out.println("Enter avenger weapon:");
        weapon = c.next();
        System.out.println("Enter avenger planet:");
        planet = c.next();
    }
    public void displayDetails()
    {
        System.out.println("Avenger name is :"+name);
        System.out.println("Avenger age is :"+age);
        System.out.println("Avenger  power is :"+power);
        System.out.println("Avenger weapon is :"+weapon);
        System.out.println("Avenger planet is "+planet);
    }

    public static void main(String[] args)
    {
        System.out.println("DAY 4 ASSIGNMENT 1");
    Avengers[] marvel = new Avengers[5];
    for (int i =0; i<5;i++)
    {
        marvel[i]=new Avengers();
        marvel[i].getDetails();
    }
    for (int j =0; j<5;j++)
    {
        marvel[j].displayDetails();
    }
    }
}
