package spring.beans;

/**
 * Created by Praneeth on 8/25/2015.
 */
public class Author {
    private String firstName;
    private String lastName;
    private String middleName;

    public Author(){}

    public Author(String firstName, String lastName, String middleName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
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
}
