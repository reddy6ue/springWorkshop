package spring.beans;

/**
 * Created by Praneeth on 8/26/2015.
 */
public class WorkShopBeanFactory {
    public Author createAuthorInstance(String fullName) {
        return Author.createInstance(fullName);
    }

    public Student createStudentInstance(String fullName) {
        return Student.createStudentInstance(fullName);
    }
}
