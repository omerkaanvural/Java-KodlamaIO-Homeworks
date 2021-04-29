public class User {
    private String name;
    private String id;
    private String age;
    private String registrationDate;
    private String email;

    public User() {}

    public User(String name, String id, String age, String registrationDate, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.registrationDate = registrationDate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
