public class Teacher extends User{
    public Teacher (String name, int id){
        //CONSTRUCTOR
        super(name, id);
    }

    public String getName(){
        return name;
    }
    public void teachClass(String course){
        System.out.println("\nIbu " + getName() + " mengajar mata kuliah " + course + ".");
    }

    @Override
    public String getUserDetail(){
        return super.getUserDetail();
    }
}