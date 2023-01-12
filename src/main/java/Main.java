import br.com.dio.challange.domain.Course;
import br.com.dio.challange.domain.Mentoring;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Description Here");
        course1.setWorkload("8,5h");

        System.out.println(course1);

        Course course2 = new Course();
        course2.setTitle("Python Course");
        course2.setDescription("Description Here");
        course2.setWorkload("5h");

        System.out.println(course2);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java Mentoring");
        mentoring.setDescription("Java mentoring description right here");
        mentoring.setDate(LocalDate.now());

        System.out.println(mentoring);


    }
}
