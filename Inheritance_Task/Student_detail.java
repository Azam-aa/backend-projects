package Inheritance_Task;

import java.util.Scanner;

class Student{
    int rollNo;
    String name;
Scanner sc = new Scanner(System.in);
    public void displayStudent(){
        System.out.println("***** Student Details *****");
        System.out.println("Roll no: "+rollNo);
        System.out.println("Name: "+name);


    }
    }

class Marks extends Student{
    int sub1;
    int sub2;
    int sub3;


    public void displayMarks(){
        System.out.println("**** DisplayMarks ****");
        System.out.println("Subject 1: "+ sub1);
        System.out.println("Subject 2: "+ sub2);
        System.out.println("Subject 3: "+ sub3);

    }

    public int calculateTotal(){
        return sub1 + sub2 + sub3;
    }
}

class Result extends Marks{
    int total;
    float percentage;

    public void  calculatePercentage(){
        total = calculateTotal();
        percentage = (total / 3.0f);
    }

    public void displayResult(){
        System.out.println("**** DisplayResult ****");
        System.out.println("Total marks : "+total);
        System.out.println("Percentage : "+ percentage+"%");

        if (sub1 >= 20 && sub2 >= 35 && sub3 >= 35 && percentage >= 40) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

    }
}

public class Student_detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result rf=new Result();

        System.out.print("Enter Roll Number: ");
        rf.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        rf.name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        rf.sub1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        rf.sub2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        rf.sub3 = sc.nextInt();

        rf.calculatePercentage();

        rf.displayStudent();
        rf.displayMarks();
        rf.displayResult();

        sc.close();


    }
}
