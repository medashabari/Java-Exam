package com.firstjava;

public class Employee {
    String name = new String();
    int age;
    String city = new String();

    public void display() {
        System.out.println("The Name is :" + name);
        System.out.println("The age is :" + age);
        System.out.println("The city is :" + city);
    }


    public static void main(String[] args) {
        System.out.println("DAY-2 ASSIGNMENT");
        System.out.println("--------------------");
        Employee s = new Employee();
        s.name = "shabarish";
        s.age = 20;
        s.city = "hyd";
        Employee s1 = new Employee();
        s1.name = "don";
        s1.age = 25;
        s1.city = "delhi";
        s.display();
        System.out.println("--------------------");
        s1.display();
    }

}
