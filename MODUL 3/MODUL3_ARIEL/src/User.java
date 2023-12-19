public class User {
    // TO DO: Create Private Attributes of User (nama, noHandphone)
    private String nama;
    private String noHanphone;

    // TO DO: Create Constructor of User
    public User(String nama, String noHanphone){
        this.nama = nama;
        this.noHanphone =  noHanphone;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setNoHandPhone(String phoneNumber) {
        this.noHanphone = noHanphone;
    }

    // TO DO: Create register Method to show information about name and phone number
    public void register() {
        System.out.println("======REGISTER BEHASIL======\n" +
                "Nama         : " + nama +
                "\nNo Handphone : " + noHanphone +
                "\n============================");
    }

    // TO DO: Create method to return name and phone number
    public String getName() {
        return "Nama : " + nama;
    }

    public String getnoHandPhone() {
        return "No Handphone : " + noHanphone;
    }
}
