public class UserManager {
    public void addUser(User user) {
        System.out.println("User " + user.getName() + " is added to database");
    }

    public void deleteUser(User user) {
        System.out.println("User " + user.getName() + " is deleted from database");
    }

    // we can not override toString method yet
    public void displayUserInfo(User user) {
        System.out.println("Username:" + user.getName() + ", User id:" + user.getId() + ", User age:" + user.getAge());
    }

    public void changeUserName(User user, String name) {
        user.setName(name);
        System.out.println("New user name is:" + name);
    }
}
