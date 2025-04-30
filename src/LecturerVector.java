package src;

import java.util.Vector;

class Lecturer {
    String name;
    int age;

    Lecturer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class LecturerVector {
    public static void main(String[] args) {
        Vector<Lecturer> lecturers = new Vector<>();

        // Initial vector
        lecturers.add(new Lecturer("Dr. Ahmad", 40));
        lecturers.add(new Lecturer("Prof. Lisa", 45));
        lecturers.add(new Lecturer("Dr. Pham", 50));
        lecturers.add(new Lecturer("Dr. Maria", 55));
        lecturers.add(new Lecturer("Prof. Rahman", 60));
        lecturers.add(new Lecturer("Dr. Sarah", 48));

        System.out.println("Vector of Lecturer objects:");
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println("Lecturer at index " + i + ": " + lecturers.get(i));
        }

        // Amendments
        lecturers.add(2, new Lecturer("Dr. Mikail", 55)); // Insert at index 2
        lecturers.set(4, new Lecturer("Dr. Emily", 52));  // Replace index 4
        lecturers.remove(5); // Remove index 5
        lecturers.trimToSize(); // Trim capacity

        System.out.println("\nVector of Lecturer objects after amendment:");
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println("Lecturer at index " + i + ": " + lecturers.get(i));
        }
    }
}
