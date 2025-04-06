package Q_05;
// Course class
class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    // Getter and Setter methods for Course
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

// Lecturer class
class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Getter and Setter methods for Lecturer
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

// Student class
class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    // Getter and Setter methods for Student
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Kasun");
        lecturer.setCourseTeaching("Electronics 101");

        // Create a Course object
        Course course = new Course();
        course.setCourseName("Electronics 101");
        course.setCourseCode("CT");
        course.setLecturer(lecturer);

        // Create a Student object
        Student student = new Student();
        student.setStudentName("Kumar");
        student.setDegreeName("Fundamentel of electronics");
        student.setCourseFollowing("CT");

        // Display the information
        System.out.println("Course Registration System");
        System.out.println("--------------------------");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Enrolled Course: " + student.getCourseFollowing());
    }
}