import java.util.Date;

public class Customer {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String nationalityId;

    public Customer(){}

    public Customer(String name, String surname, Date dateOfBirth, String nationalityId) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

}
