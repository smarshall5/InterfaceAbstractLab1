package lab1;

public class StartProgram {
    public static void main(String[] args) {
        SchoolClasses course1 = new AdvancedJavaCourse("Advanced Java","2000");
        SchoolClasses course2 = new IntroToProgrammingCourse("Intro to programming","2001");
        SchoolClasses course3 = new IntroJavaCourse("Intro to Java", "2002");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);


    }
}
