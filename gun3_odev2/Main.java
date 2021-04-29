public class Main {

    public static void main(String[] args) {
        Course javaCourse = new Course("JAVA");
        Course pythonCourse = new Course("PYTHON");
        Course goCourse = new Course("GO");

        Course[] coursesIsAlreadyTaken = {javaCourse, pythonCourse};
        Course[] coursesOnWishlist = {goCourse};

        User user = new User();
        Student student1 = new Student("kaan", "1", "21", "29 April 2021", "kaan@hotmail.com", coursesIsAlreadyTaken, coursesOnWishlist);
        Instructor instructor1 = new Instructor("engin", "2", "35", "29 April 2021", "engin@hotmail.com", 10, 10000);

        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        user.setName("mike");
        user.setAge("20");
        user.setEmail("mike@gmail.com");
        user.setId("3");
        user.setRegistrationDate("29 April 2021");

        System.out.println(user.getName());

        userManager.addUser(student1);
        userManager.addUser(instructor1);
        userManager.deleteUser(student1);
        userManager.changeUserName(student1, "ahmet");
        userManager.displayUserInfo(instructor1);

        instructorManager.displayUserInfo(instructor1);
        instructorManager.registrationForIns(student1, instructor1);

        studentManager.displayUserInfo(student1);
        studentManager.addedToWishlist(student1, goCourse);

    }
}
