import java.util.ArrayList;
public class Student extends User{
    protected ArrayList<String> enrolledCourse;

    public Student (String name, int id){
        // CONSTRUCTOR
        super(name, id);
        this.enrolledCourse = new ArrayList<>();
    }

    public void enrollInCourse (String course){
        // ADD DATA
        this.enrolledCourse.add(course);
    }
    @Override
    public String getUserDetail(){
        // STRING METHOD
        return "\nStudent - " + super.getUserDetail() +
                "\nEnrolled Course : " + enrolledCourse;
    }

}