package spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.StringWriter;
import java.util.Map;
import java.util.Scanner;

import spring.beans.Author;
import spring.beans.Book;
import spring.beans.Student;


public class SpringWorkshopApplication {

    public static void main(String[] args) {
        //Jackson parser
        // This can also be pushed into beans.xml
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            try {
                System.out.println("1.List Books");
                System.out.println("2.List Students");
                System.out.println("3.List Authors");
                System.out.println("0:Exit");
                String input = sc.nextLine();
                switch (Integer.parseInt(input)) {
                    case 0:
                        System.out.println("Exiting the library application");
                        System.exit(0);
                        break;
                    case 1:
                        Map<String, Book> books = context.getBeansOfType(Book.class);
                        System.out.println("The following Book beans are defined");
                        System.out.println("----------------------------------------");
                        for(String bookName : books.keySet()) {
                            System.out.println("bean id =" + bookName);
                            System.out.println("----------------------------------------");
                            StringWriter book = new StringWriter();
                            mapper.writeValue(book, context.getBean(bookName));
                            System.out.println(book);
                            System.out.println("----------------------------------------");
                        }
                        System.out.println("========================================");
                        break;
                    case 2:
                        Map<String, Student> students = context.getBeansOfType(Student.class);
                        System.out.println("The following Student beans are defined");
                        System.out.println("----------------------------------------");
                        for(String studentName : students.keySet()) {
                            System.out.println("bean id =" + studentName);
                            System.out.println("----------------------------------------");
                            StringWriter student = new StringWriter();
                            mapper.writeValue(student, context.getBean(studentName));
                            System.out.println(student);
                            System.out.println("----------------------------------------");
                        }
                        System.out.println("========================================");
                        break;
                    case 3:
                        Map<String, Author> authors = context.getBeansOfType(Author.class);
                        System.out.println("The following Author beans are defined");
                        System.out.println("----------------------------------------");
                        for(String authorName : authors.keySet()) {
                            System.out.println("bean id =" + authorName);
                            System.out.println("----------------------------------------");
                            StringWriter author = new StringWriter();
                            mapper.writeValue(author, context.getBean(authorName));
                            System.out.println(author);
                            System.out.println("----------------------------------------");
                        }
                        System.out.println("========================================");
                        break;
                    default:
                        continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
