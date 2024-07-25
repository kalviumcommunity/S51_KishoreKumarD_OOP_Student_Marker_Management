package S51_KishoreKumarD_OOP_Student_Marker_Management;

import java.util.*;

class Student {
    private String studentId;
    private String studentName;
    // private Map<String, Marker> markers;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        // this.markers = new HashMap<>();
    }

    // No-argument constructor
    public Student() {
        this.studentId = "";
        this.studentName = "";
    }

    // Correct setter methods
    void setStudentId(String studentId){
        this.studentId = studentId;
    }

    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    String getStudentId(){
        return this.studentId;
    }

    String getStudentName(){
        return this.studentName;
    }
}

class Marker {
    private String markerId;
    private String markerName;
}

public class Main {
    public static void main(String[] args){
        Student stud1 = new Student();

        String studentId = "2";
        String studentName = "badri";
        stud1.setStudentId(studentId);
        stud1.setStudentName(studentName);

        // Correct print statements
        System.out.println("Student ID: " + stud1.getStudentId());
        System.out.println("Student Name: " + stud1.getStudentName());

        System.out.println("Hello world");
    }
}
