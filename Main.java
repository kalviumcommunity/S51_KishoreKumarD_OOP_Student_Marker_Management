package S51_KishoreKumarD_OOP_Student_Marker_Management;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String studentId;
    private String studentName;
    private Map<String, Marker> markers;
    private static int countOfStudent = 0;

    // Constructor to initialize student details
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.markers = new HashMap<>(); // Initialize the markers map
        countOfStudent++; // Increment the student count when a new student is created
    }

    // Getter and Setter methods for studentId and studentName
    void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    String getStudentId() {
        return this.studentId;
    }

    String getStudentName() {
        return this.studentName;
    }

    // Method to add markers to the student
    void addMarker(Marker marker) {
        this.markers.put(marker.getMarkerName(), marker);
    }

    // Method to return the total number of students created
    public static int getTotalStudents() {
        return countOfStudent;
    }

    // Method to display student info along with their markers
    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Markers: ");
        for (Marker marker : markers.values()) {
            marker.displayMarkerInfo(); // Display each marker's info
        }
    }
}

class Marker {
    private String markerName;
    private int score;
    private static int totalMarkers = 0;

    // Constructor to initialize marker details
    public Marker(String markerName, int score) {
        this.markerName = markerName;
        this.score = score;
        totalMarkers++; // Increment the marker count when a new marker is created
    }

    // Getter and Setter methods for markerName and score
    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMarkerName() {
        return this.markerName;
    }

    public int getScore() {
        return this.score;
    }

    // Method to return the total number of markers created
    public static int getTotalMarkers() {
        return totalMarkers;
    }

    // Method to display marker information
    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + this.markerName);
        System.out.println("Marker Score: " + this.score);
    }
}

// Different types of Markers, inheriting from Marker class
class DojoMarker extends Marker {
    public DojoMarker(String markerName, int score) {
        super(markerName, score);
    }
}

class ProfessionalismMarker extends Marker {
    public ProfessionalismMarker(String markerName, int score) {
        super(markerName, score);
    }
}

class CodingMarker extends Marker {
    public CodingMarker(String markerName, int score) {
        super(markerName, score);
    }
}

class ProjectMarker extends Marker {
    public ProjectMarker(String markerName, int score) {
        super(markerName, score);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create students
        Student stud1 = new Student("1", "John");
        Student stud2 = new Student("2", "You");
        Student stud3 = new Student("3", "Joe");
        Student stud4 = new Student("4", "Anna");
        Student stud5 = new Student("5", "Me");

        // Create markers
        Marker professionalismMarker = new ProfessionalismMarker("Professionalism", 85);
        Marker caScoresMarker = new Marker("CA Scores", 90);
        DojoMarker dojoMarker = new DojoMarker("Dojo Performance", 75);
        CodingMarker codingSkillsMarker = new CodingMarker("Coding Skills", 95);
        ProjectMarker projectSkillsMarker = new ProjectMarker("Project Skills", 88);

        // Add markers to students
        stud1.addMarker(professionalismMarker);
        stud1.addMarker(caScoresMarker);
        stud1.addMarker(dojoMarker);
        stud1.addMarker(codingSkillsMarker);
        stud1.addMarker(projectSkillsMarker);

        stud2.addMarker(professionalismMarker);
        stud2.addMarker(projectSkillsMarker);

        stud3.addMarker(professionalismMarker);
        stud3.addMarker(caScoresMarker);
        stud3.addMarker(dojoMarker);

        stud4.addMarker(professionalismMarker);

        // Store students in an array
        Student[] students = {stud1, stud2, stud3, stud4, stud5};

        // Display each student's info
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println();
        }

        // Display total markers and students
        System.out.println("Total Number of Markers: " + Marker.getTotalMarkers());
        System.out.println("Total Number of Students: " + Student.getTotalStudents());
    }
}
