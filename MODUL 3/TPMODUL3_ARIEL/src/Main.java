import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        // INPUT DECLARATION
        Scanner input = new Scanner(System.in);

        // INPUT USER
        System.out.print("Enter Student Name    : ");
        String name = input.nextLine();

        // ERROR HANDLING STUDENT
        int id = 0;
        while (true){
            try {
                System.out.print("Enter Student ID      : ");
                id = input.nextInt();
                input.nextLine();
                break;
            }
            catch (Exception InputMismatchException){
                System.out.println("Invalid input, pleas enter a valid integer for Student id");
                input.nextLine();
            }
        }
        System.out.print("Enter courses to enroll in (Separated by comas) : ");
        String courseName = input.nextLine();

        // SPLIT COURSES
        String[] courseList = courseName.split(", ");

        // DISPLAY COURSES
        for (int i = 0; i < courseList.length; i++) {
            System.out.println("\nCourse ID: " + (i + 101) + ",");
            System.out.println("Course Name: " + courseList[i]);
            System.out.println("Student: ");
            System.out.println("- "+ name);
        }

        // ADDING DATA
        Student student1 = new Student(name, id);
        student1.enrollInCourse(courseName);

        // TEACHER AND ADMIN IDENTITY
        Teacher teacher1 = new Teacher("Ola", 110123);
        Admin admin1 = new Admin("Andreas", 11012023);

        // OUTPUT
        // Enroll student in courses
        for (String course : courseList) {
            student1.enrollInCourse(course);
        }
        System.out.println(student1.getUserDetail());
        teacher1.teachClass("Matematika");
        admin1.manageSystem(" managing the university system.");
    }
}