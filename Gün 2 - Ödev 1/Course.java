public class Course {
    String courseName;  // Description of the course
    boolean isCoursePaid;   // Is the course paid or free
    int numberOfLecture;    // How many lectures are in the course

    public Course(String courseName, boolean isCoursePaid, int numberOfLecture) {
        this.courseName = courseName;
        this.isCoursePaid = isCoursePaid;
        this.numberOfLecture = numberOfLecture;
    }
}
