public class InstructorManager extends UserManager{

    // Using UserManager as an interface would be better but we can not use it yet.
    @Override
    public void displayUserInfo(User user) {
        super.displayUserInfo(user);
        System.out.println("Also this user is an instructor");
    }

    public void registrationForIns(Student student, Instructor ins) {
        System.out.println("Student " + student.getName() + " is registered the course of instructor " + ins.getName());
    }

}
