package S51_KishoreKumarD_OOP_Student_Marker_Management;

class Student {
    private String studentId;
    private String studentName;
    // private Map<String, Marker> markers;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        // private Map<String, Marker> markers;
    }
    
    public Student() {
        this.studentId = "";
        this.studentName = "";
        // this.markers = new HashMap<>();
    }

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

    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
    }
}

class Marker {
    private String markerId;
    private String markerName;

    public Marker(String markerId, String markerName) {
        this.markerId = markerId;
        this.markerName = markerName;
    }

    public Marker() {
        this.markerId = "";
        this.markerName = "";
    }

    void setMarkerId(String markerId){
        this.markerId = markerId;
    }

    void setMarkerName(String markerName){
        this.markerName = markerName;
    }

    String getMarkerId(){
        return this.markerId;
    }

    String getMarkerName(){
        return this.markerName;
    }

    public void displayMarkerInfo() {
        System.out.println("Marker ID: " + this.markerId);
        System.out.println("Marker Name: " + this.markerName);
    }
}

public class Main {
    public static void main(String[] args){
        Student stud1 = new Student();

        String studentId = "1";
        String studentName = "John";
        stud1.setStudentId(studentId);
        stud1.setStudentName(studentName);

        // stud1.displayStudentInfo();

        System.out.println("Student ID: " + stud1.getStudentId());
        System.out.println("Student Name: " + stud1.getStudentName());

        Marker marker1 = new Marker();
        Marker marker2 = new Marker("2", "CA scores");
        
        // marker2.displayMarkerInfo();

        String markerId = "1";
        String markerName = "Professionalism";

        marker1.setMarkerId(markerId);
        marker1.setMarkerName(markerName);

        // System.out.println("Student ID: " + stud1.getStudentId());
        // System.out.println("Student Name: " + stud1.getStudentName());

        System.out.println("Marker ID: " + marker1.getMarkerId());
        System.out.println("Marker Name: " + marker1.getMarkerName());
        
        marker2.displayMarkerInfo();

        System.out.println("Hello world");
    }
}
