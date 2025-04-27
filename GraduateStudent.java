public class GraduateStudent extends Student {
    private String researchTopic;
    private String advisor;

    // Constructor
    public GraduateStudent(String name, int id, double gpa, String researchTopic, String advisor) {
        super(name, id, gpa);  // Call parent class constructor
        this.researchTopic = researchTopic;
        this.advisor = advisor;
    }

    // Getters and Setters for additional fields
    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    // Override the displayInfo method (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class method
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Advisor: " + advisor);
    }
}