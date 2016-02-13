package modelo;
public class Boss {
    private String socialSecurityNumber;
    private String name;
    private String surname;
    private String password;

    public Boss(String socialSecurityNumber, String name, String surname, String password) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
