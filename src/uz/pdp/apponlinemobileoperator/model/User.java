package uz.pdp.apponlinemobileoperator.model;

import uz.pdp.apponlinemobileoperator.model.enums.Gender;
import uz.pdp.apponlinemobileoperator.model.template.AbsInit;

import java.sql.Date;

public class User extends AbsInit {

    private String firstName;
    private String lastName;
    private String middleName;
    private String passport;
    // enum
    private Gender gender;
    private Date birthDate;

    private String username;
    private String password;
    private boolean isAdmin = false;

    public User(String firstName, String lastName, String middleName, String passport, Gender gender, Date birthDate, String username, String password, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.passport = passport;
        this.gender = gender;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String firstName, String lastName, String middleName, String passport, Gender gender, Date birthDate, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.passport = passport;
        this.gender = gender;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", passport='" + passport + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isActive=" + isActive() +
                ", id=" + getId() +
                '}';
    }
}
