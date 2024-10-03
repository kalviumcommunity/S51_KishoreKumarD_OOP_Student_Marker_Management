package S51_KishoreKumarD_OOP_Student_Marker_Management;

import java.util.HashMap;
import java.util.Map;

abstract class BaseStudent {
    protected String studentId;
    protected String studentName;
    protected Map<String, Marker> markers;
    protected static int countOfStudent = 0;

    // Constructor to initialize student details
    public BaseStudent(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.markers = new HashMap<>();
        countOfStudent++;
    }

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

    void addMarker(Marker marker) {
        this.markers.put(marker.getMarkerName(), marker);
    }

    public static int getTotalStudents() {
        return countOfStudent;
    }

    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Markers: ");
        for (Marker marker : markers.values()) {
            marker.displayMarkerInfo();
        }
    }
}

class UndergraduateStudent extends BaseStudent {
    public UndergraduateStudent(String studentId, String studentName) {
        super(studentId, studentName);
    }
}

class GraduateStudent extends BaseStudent {
    public GraduateStudent(String studentId, String studentName) {
        super(studentId, studentName);
    }
}

class Marker {
    private String markerName;
    private int score;
    private static int totalMarkers = 0;

    public Marker(String markerName, int score) {
        this.markerName = markerName;
        this.score = score;
        totalMarkers++;
    }

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

    public static int getTotalMarkers() {
        return totalMarkers;
    }

    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + this.markerName);
        System.out.println("Marker Score: " + this.score);
    }
}

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
        UndergraduateStudent stud1 = new UndergraduateStudent("1", "John");
        GraduateStudent stud2 = new GraduateStudent("2", "You");
        UndergraduateStudent stud3 = new UndergraduateStudent("3", "Joe");
        GraduateStudent stud4 = new GraduateStudent("4", "Anna");
        UndergraduateStudent stud5 = new UndergraduateStudent("5", "Me");

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
        BaseStudent[] students = {stud1, stud2, stud3, stud4, stud5};

        // Display each student's info
        for (BaseStudent student : students) {
            student.displayStudentInfo();
            System.out.println();
        }

        // Display total markers and students
        System.out.println("Total Number of Markers: " + Marker.getTotalMarkers());
        System.out.println("Total Number of Students: " + BaseStudent.getTotalStudents());
    }
}
