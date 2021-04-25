public class CourseManager {
    public void displayAllCourses(Course[] courses) {
        System.out.println("--------- COURSES ---------");
        for (Course course: courses) {
            System.out.println("--> " + course.courseName);
        }
        System.out.println(); // for aesthetic on terminal
    }

    public void displayFreeCourses(Course[] courses) {
        System.out.println("--------- FREE COURSES ---------");
        for (Course course: courses) {
            if (!course.isCoursePaid) {
                System.out.println("--> " + course.courseName);
            }
        }
        System.out.println(); // for aesthetic on terminal
    }
}
