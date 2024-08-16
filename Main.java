package S51_KishoreKumarD_OOP_Student_Marker_Management;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String studentId;
    private String studentName;
    private Map<String, Marker> markers;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.markers = new HashMap<>();
    }

    public Student() {
        this.studentId = "";
        this.studentName = "";
        this.markers = new HashMap<>();
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

    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Markers: ");
        for (Marker marker : markers.values()) {
            marker.displayMarkerInfo();
        }
    }
}

class Marker {
    private String markerName;
    private int score;

    public Marker(String markerName, int score) {
        this.markerName = markerName;
        this.score = score;
    }

    public Marker() {
        this.markerName = "";
        this.score = 0;
    }

    void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    void setScore(int score) {
        this.score = score;
    }

    String getMarkerName() {
        return this.markerName;
    }

    int getScore() {
        return this.score;
    }

    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + this.markerName);
        System.out.println("Marker Score: " + this.score);
    }
}

// Subclasses of Marker
class DojoMarker extends Marker {
    public DojoMarker(String markerName, int score) {
        super(markerName, score);
    }

    public DojoMarker() {
        super();
    }

    @Override
    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + getMarkerName());
        System.out.println("Marker Score: " + getScore());
    }
}

class ProfessionalismMarker extends Marker {
    public ProfessionalismMarker(String markerName, int score) {
        super(markerName, score);
    }

    public ProfessionalismMarker() {
        super();
    }

    @Override
    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + getMarkerName());
        System.out.println("Marker Score: " + getScore());
    }
}

class CodingMarker extends Marker {
    public CodingMarker(String markerName, int score) {
        super(markerName, score);
    }

    public CodingMarker() {
        super();
    }

    @Override
    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + getMarkerName());
        System.out.println("Marker Score: " + getScore());
    }
}

class ProjectMarker extends Marker {
    public ProjectMarker(String markerName, int score) {
        super(markerName, score);
    }

    public ProjectMarker() {
        super();
    }

    @Override
    public void displayMarkerInfo() {
        System.out.println("Marker Name: " + getMarkerName());
        System.out.println("Marker Score: " + getScore());
    }
}

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("1", "John");
        Student stud2 = new Student("2", "Jane");
        Student stud3 = new Student("3","Joe");

        Marker professionalismMarker = new ProfessionalismMarker("Professionalism", 85);
        Marker caScoresMarker = new Marker("CA scores", 90);
        DojoMarker dojoMarker = new DojoMarker("Dojo Performance", 75);
        CodingMarker codingSkillsMarker = new CodingMarker("Coding Skills", 95);
        ProjectMarker projectSkillsMarker = new ProjectMarker("Project Skills", 88);

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

        // Delete keyword is not needed to be used, becuase Java takes care of the memory management during
        // run-time with the help of it's Garabage collector. 

        Student[] students = {stud1, stud2, stud3};

        for (Student student : students) {
            student.displayStudentInfo();
            System.out.print(" ");
            System.out.println();
        }
    }
}
