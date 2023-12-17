public class Admin extends User {
    public Admin (String name, int id){
        super(name, id);
    }

    public String getName(){
        return name;
    }

    public void manageSystem (String course){
        System.out.println("Pak " + getName() + course);
    }
    @Override
    public String getUserDetail(){
        return super.getUserDetail();
    }
}
