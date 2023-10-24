import javax.naming.NameAlreadyBoundException;

public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name;
    private int Phone_number;

    public User(String Name, int Phone_number){
        this.Name = Name;
        this.Phone_number = Phone_number;
    }

    // Setter Section
    public void setName(String name) {
        Name = name;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void Registration(){
        try{
            System.out.println("Registrasi Berhasil !");
            System.out.println("Nama : " + Name);
            System.out.println("No. Handphone : " + Phone_number);
        }
    }
}
