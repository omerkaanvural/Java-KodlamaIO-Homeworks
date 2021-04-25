public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("Java", false, 10);
        Course course2 = new Course("Python", false, 7);
        Course course3 = new Course("JavaScript", true, 16);

        User user1 = new User(0, "kaan vural", "kaan@hotmail.com", 86);
        User user2 = new User(0, "omer ural", "omer@gmail.com", 43);
        User user3 = new User(0, "engin demirog", "engin@hotmail.com", 21);

        Course[] courses = {course1, course2, course3};
        User[] users = {user1, user2, user3};

        CourseManager cm1 = new CourseManager();
        UserManager um1 = new UserManager();

        cm1.displayAllCourses(courses);
        cm1.displayFreeCourses(courses);

        um1.displayUsers(users);
        um1.displaySpecificCompletionUsers(users, 50);

    }
}
