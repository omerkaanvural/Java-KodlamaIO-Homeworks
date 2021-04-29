public class Student extends User{
    private Course[] courses;
    private Course[] wishlist;

    public Student() {}

    public Student(String name, String id, String age, String registrationDate, String email, Course[] courses, Course[] wishlist) {
        super(name, id, age, registrationDate, email);
        this.courses = courses;
        this.wishlist = wishlist;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Course[] getWishlist() {
        return wishlist;
    }

    public void setWishlist(Course[] wishlist) {
        this.wishlist = wishlist;
    }
}
