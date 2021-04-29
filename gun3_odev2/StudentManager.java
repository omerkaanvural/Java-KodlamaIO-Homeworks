public class StudentManager extends  UserManager{
    @Override
    public void displayUserInfo(User user) {
        super.displayUserInfo(user);
        System.out.println("Also this user is a student");
    }

    public void addedToWishlist(Student student, Course course) {
        System.out.println("Student " + student.getName() + " added the course '" + course.getName() + "' to wishlist.");
    }
}
