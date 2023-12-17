public class User {
    protected String name;
    protected int id;

    public User (String name, int id){
        // COONSTRUCTOR
        this.name = name;
        this.id = id;
    }

    public String getUserDetail(){
        // STRING METHOD
        return "Name : " + name + ", ID : " + id;
    }
}
