package S51_KishoreKumarD_OOP_Student_Marker_Management;

import java.util.HashMap;
import java.util.Map;

class MarkerManager {
    private Map<String, Marker> markers;

    public MarkerManager() {
        this.markers = new HashMap<>();
    }

    void addMarker(Marker marker) {
        this.markers.put(marker.getMarkerName(), marker);
    }

    void displayMarkers() {
        for (Marker marker : markers.values()) {
            marker.displayMarkerInfo();
            System.out.println(marker.describeMarker());
        }
    }

    int getTotalMarkers() {
        return markers.size();
    }
}

abstract class BaseStudent {
    protected String studentId;
    protected String studentName;
    protected MarkerManager markerManager;
    protected static int countOfStudent = 0;

    public BaseStudent(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.markerManager = new MarkerManager();
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
        this.markerManager.addMarker(marker);
    }

    public static int getTotalStudents() {
        return countOfStudent;
    }

    // SRP: Separating student display logic from marker display logic
    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
    }

    // SRP: Displaying markers as a separate method for Single Responsibility
    void displayMarkers() {
        System.out.println("Markers: ");
        this.markerManager.displayMarkers();
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

    public Marker(String markerName) {
        this(markerName, 50);
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

    public String describeMarker() {
        return "This is a generic marker.";
    }
}

class DojoMarker extends Marker {
    public DojoMarker(String markerName, int score) {
        super(markerName, score);
    }

    @Override
    public String describeMarker() {
        return "This marker evaluates dojo performance.";
    }
}

class ProfessionalismMarker extends Marker {
    public ProfessionalismMarker(String markerName, int score) {
        super(markerName, score);
    }

    @Override
    public String describeMarker() {
        return "This marker assesses professionalism.";
    }
}

class CodingMarker extends Marker {
    public CodingMarker(String markerName, int score) {
        super(markerName, score);
    }

    @Override
    public String describeMarker() {
        return "This marker evaluates coding skills.";
    }
}

class ProjectMarker extends Marker {
    public ProjectMarker(String markerName, int score) {
        super(markerName, score);
    }

    @Override
    public String describeMarker() {
        return "This marker assesses project skills.";
    }
}

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent stud1 = new UndergraduateStudent("1", "John");
        GraduateStudent stud2 = new GraduateStudent("2", "You");
        UndergraduateStudent stud3 = new UndergraduateStudent("3", "Joe");
        GraduateStudent stud4 = new GraduateStudent("4", "Anna");
        UndergraduateStudent stud5 = new UndergraduateStudent("5", "Me");

        Marker professionalismMarker = new ProfessionalismMarker("Professionalism", 85);
        Marker caScoresMarker = new Marker("CA Scores", 90);
        DojoMarker dojoMarker = new DojoMarker("Dojo Performance", 75);
        CodingMarker codingSkillsMarker = new CodingMarker("Coding Skills", 95);
        ProjectMarker projectSkillsMarker = new ProjectMarker("Project Skills", 88);
        Marker defaultMarker = new Marker("Default Marker");

        stud1.addMarker(professionalismMarker);
        stud1.addMarker(caScoresMarker);
        stud1.addMarker(dojoMarker);
        stud1.addMarker(codingSkillsMarker);
        stud1.addMarker(projectSkillsMarker);
        stud1.addMarker(defaultMarker);

        stud2.addMarker(professionalismMarker);
        stud2.addMarker(projectSkillsMarker);

        stud3.addMarker(professionalismMarker);
        stud3.addMarker(caScoresMarker);
        stud3.addMarker(dojoMarker);

        stud4.addMarker(professionalismMarker);

        BaseStudent[] students = {stud1, stud2, stud3, stud4, stud5};

        for (BaseStudent student : students) {
            student.displayStudentInfo();
            student.displayMarkers(); // Separate marker display for SRP compliance
            System.out.println();
        }

        System.out.println("Total Number of Markers: " + Marker.getTotalMarkers());
        System.out.println("Total Number of Students: " + BaseStudent.getTotalStudents());
    }
}
