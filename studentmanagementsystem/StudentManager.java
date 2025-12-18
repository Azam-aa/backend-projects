package studentmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    Map<Integer, Student> data = new HashMap<>();

    public void addStudent(int roll, String name) {
        Student s = new Student(roll, name);
        data.put(roll, s);
        System.out.println("Student added");
    }

    public void searchStudent(int roll) {
        Student s = data.get(roll);
        if (s != null) {
            s.showStudent();
        } else {
            System.out.println("Student not found");
        }
    }

    public void updateStudent(int roll, String course, double grade) {
        Student s = data.get(roll);
        if (s != null) {
            s.addCourse(course, grade);
            System.out.println("Updated");
        } else {
            System.out.println("Student not found");
        }
    }

    public void deleteStudent(int roll) {
        if (data.remove(roll) != null) {
            System.out.println("Deleted");
        } else {
            System.out.println("Student not found");
        }
    }

    public void showAll() {
        if (data.isEmpty()) {
            System.out.println("No students");
        } else {
            for (Student s : data.values()) {
                s.showStudent();
                System.out.println();
            }
        }
    }
}
