public class UserManager {
    public void displayUsers(User[] users) {
        System.out.println("--------- USERS ---------");
        for (User user: users) {
            System.out.println("--> " + user.name);
        }
        System.out.println(); // for aesthetic on terminal
    }

    // This method is for observing the students which are passed a certain stage of the course as a percentage
    public void displaySpecificCompletionUsers(User[] users, int percentage) {
        System.out.println("--------- CERTAIN USERS ---------" + " (OVER " + percentage + ")");
        for (User user: users) {
            if (user.courseCompletionPercentage >= percentage)
            System.out.println("--> " + user.name + " , percentage: " + user.courseCompletionPercentage);
        }
        System.out.println(); // for aesthetic on terminal
    }
}
