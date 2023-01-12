import br.com.dio.challange.domain.*;


public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Why Java?");
        course1.setDescription("You will learn why programming with Java can take you to another level in your career");
        course1.setWorkload(8.0);

//        System.out.println(course1);

        Course course2 = new Course();
        course2.setTitle("How does OOP works?");
        course2.setDescription("In this course we will show you with practical examples how this way of programming works");
        course2.setWorkload(9.0);

        // System.out.println(course2);

        Course course3 = new Course();
        course3.setTitle("Java Collections");
        course3.setDescription("How can I use Arrays, Lists, Sets? In this course you will learn from basic to advanced how to use the Collections Framework");
        course3.setWorkload(12.0);

        // System.out.println(course3);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java Developer");
        bootcampJava.setDescription("Learn Java and become a Backend Developer");
        bootcampJava.getContentBootcamp().add(course1);
        bootcampJava.getContentBootcamp().add(course2);
//      bootcampJava.getContentBootcamp().add(course3);

        Dev devGusto = new Dev();
        devGusto.setName("Augusto");
        devGusto.signInBootcamp(bootcampJava);
        System.out.println("Augusto has signed in at those courses: " + devGusto.getSignedContent());

        devGusto.toProgress();
        System.out.println("Augusto have already finished: " + devGusto.getCompletedContent());
        System.out.println(devGusto.getName() + " XP: " + devGusto.totalXp());
        System.out.println("---------");

        Dev devElyn = new Dev();
        devElyn.setName("Evelyn");
        devElyn.signInBootcamp(bootcampJava);
        System.out.println("Evelyn has signed in at those courses: " + devElyn.getSignedContent());

        devElyn.toProgress();
        System.out.println("Evelyn have already finished: " + devGusto.getCompletedContent());
        System.out.println(devElyn.getName() + " XP: " + devElyn.totalXp());
    }
}
