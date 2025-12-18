package studentmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("********************************");
            System.out.println("1 Add Student");
            System.out.println("2 Search Student");
            System.out.println("3 Update Course and Grade");
            System.out.println("4 Delete Student");
            System.out.println("5 Show All Students");
            System.out.println("6 Exit");
            System.out.println("********************************");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Roll: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                manager.addStudent(roll, name);
            }

            if (choice == 2) {
                System.out.print("Roll: ");
                int roll = sc.nextInt();
                manager.searchStudent(roll);
            }

            if (choice == 3) {
                System.out.print("Roll: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Course: ");
                String course = sc.nextLine();
                System.out.print("Grade: ");
                double grade = sc.nextDouble();
                manager.updateStudent(roll, course, grade);
            }

            if (choice == 4) {
                System.out.print("Roll: ");
                int roll = sc.nextInt();
                manager.deleteStudent(roll);
            }

            if (choice == 5) {
                manager.showAll();
            }
        }

        sc.close();
    }
}
