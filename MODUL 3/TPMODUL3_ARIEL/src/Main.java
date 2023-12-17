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

        // ADDING DATA 1
        Student student1 = new Student(name, id);
        student1.enrollInCourse(courseName);

        // TEACHER AND ADMIN IDENTITY
        Teacher teacher1 = new Teacher("Ola", 110123);
        Admin admin1 = new Admin("Andreas", 11012023);

        // OUTPUT
        System.out.println(student1.getUserDetail());
        teacher1.teachClass("Matematika");
        admin1.manageSystem(" managing the university system.");
    }
}