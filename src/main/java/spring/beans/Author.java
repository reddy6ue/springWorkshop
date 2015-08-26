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

    public static Author createInstance(String fullName)
    {
        String[] nameParts = fullName.split(" ");
        if (nameParts != null) {
            switch (nameParts.length) {
                case 1:
                    return new Author(nameParts[0], "", "");
                case 2:
                    return new Author(nameParts[0],nameParts[1], "");
                case 3:
                    return new Author(nameParts[0], nameParts[2], nameParts[1]);
            }
        }
        return new Author();
    }
}
