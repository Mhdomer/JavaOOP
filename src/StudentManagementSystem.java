package src;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create a regular student
        Student undergrad = new Student("John Doe", 1001, 3.5);
        
        // Create a graduate student
        GraduateStudent gradStudent = new GraduateStudent("Jane Smith", 2001, 3.8, 
            "Machine Learning", "Dr. Johnson");

        // Demonstrate encapsulation using getters and setters
        System.out.println("\nDemonstrating Encapsulation:");
        undergrad.setGpa(3.7);  // Valid GPA
        undergrad.setGpa(5.0);  // Invalid GPA - will show error message

        // Demonstrate polymorphism
        System.out.println("\nDemonstrating Polymorphism:");
        System.out.println("Undergraduate Student Information:");
        undergrad.displayInfo();

        System.out.println("\nGraduate Student Information:");
        gradStudent.displayInfo();

        // Demonstrate inheritance by accessing parent class methods
        System.out.println("\nDemonstrating Inheritance:");
        System.out.println("Graduate Student Name: " + gradStudent.getName());
        System.out.println("Graduate Student ID: " + gradStudent.getId());
    }
}