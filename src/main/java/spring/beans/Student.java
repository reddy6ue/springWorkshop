package spring.beans;

        import java.util.HashSet;
        import java.util.Set;

/**
 * Created by Praneeth on 8/25/2015.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String middleName;

    private Set<Book> issuedBooks = new HashSet<Book>();

    private Set<Book> reservedBooks = new HashSet<Book>();

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

    public Set<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(Set<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public Set<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void setReservedBooks(Set<Book> reservedBooks) {
        this.reservedBooks = reservedBooks;
    }
}
