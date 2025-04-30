package src;

import java.util.ArrayList;

class StudentRecord {
    private String name;
    private int age;

    public StudentRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<StudentRecord> students = new ArrayList<>();

        // Initial list
        students.add(new StudentRecord("Abu", 20));
        students.add(new StudentRecord("Fatimah", 21));
        students.add(new StudentRecord("Boon", 22));
        students.add(new StudentRecord("Ali", 23));
        students.add(new StudentRecord("Puteri", 25));

        System.out.println("ArrayList of Student objects:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student at index " + i + ": " + students.get(i));
        }

        // Amendments
        students.add(3, new StudentRecord("Naufal", 20)); // Insert at index 3
        students.set(4, new StudentRecord("Phoom", 23));  // Replace Ali

        System.out.println("\nArrayList of Student objects after amendment:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student at index " + i + ": " + students.get(i));
        }
    }
}
