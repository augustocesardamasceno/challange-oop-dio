import br.com.dio.challange.domain.Content;
import br.com.dio.challange.domain.Course;
import br.com.dio.challange.domain.Mentoring;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Description Here");
        course1.setWorkload(8.0);

        System.out.println(course1);

        Course course2 = new Course();
        course2.setTitle("Python Course");
        course2.setDescription("Description Here");
        course2.setWorkload(9.0);

        System.out.println(course2);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java Mentoring");
        mentoring.setDescription("Java mentoring description right here");
        mentoring.setDate(LocalDate.now());

        System.out.println(mentoring);

        Mentoring mentoring2 = new Mentoring();
        mentoring.setTitle("Python Mentoring");
        mentoring.setDescription("Python mentoring description right here");
        mentoring.setDate(LocalDate.now());

        System.out.println(mentoring2);

        Content content = new Course();

    }
}
