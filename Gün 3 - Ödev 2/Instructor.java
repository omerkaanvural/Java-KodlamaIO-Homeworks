public class Instructor extends User{
    private int numberOfCourses;
    private int numberOfStudents;

    public Instructor() {}

    public Instructor(String name, String id, String age, String registrationDate, String email, int numberOfCourses, int numberOfStudents) {
        super(name, id, age, registrationDate, email);
        this.numberOfCourses = numberOfCourses;
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
