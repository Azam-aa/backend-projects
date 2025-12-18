package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    int roll;
    String name;
    List<String> courses;
    Map<String, Double> grades;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        courses = new ArrayList<>();
        grades = new TreeMap<>();
    }

    public void addCourse(String course, double grade) {
        courses.add(course);
        grades.put(course, grade);
    }

    public void showStudent() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Courses: " + courses);
        System.out.println("Grades: " + grades);
    }
}
