import java.util.Objects;
import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scan = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        Bioskop cinema = new Bioskop();
       /* Cashier cashier1 = new Cashier();*/

        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("=====SILAHKAN REGISTER=====");
        System.out.print("Masukan nama         : ");
        String name = scan.nextLine();

        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.print("Masukan No Handphone : ");
        String noHanphone = scan.nextLine();
        System.out.println("============================\n");
        User user1 = new User(name, noHanphone);
        user1.register();

        // TO DO : Create a code for ticket order
        System.out.println("Selamat datang di bioskop EAD!");
        System.out.println("Book seat ");
        cinema.displaySeating();

        while (true) {
            System.out.println("Apakah anda ingin memesan kursi?(y/n)");
            String option = scan.nextLine();
            if (Objects.equals(option, "y")) {
                System.out.print("Pilih baris kursi : ");
                int booking_baris = scan.nextInt();
                System.out.print("Pilih kolom kursi : ");
                int booking_kolom = scan.nextInt();
                cinema.reserve(booking_baris,booking_kolom);
            }else{
                break;
            }
        }
        
        // TO DO : Create a exception if user enter not number
        try{
            System.out.println("");
        }catch(Exception InputMismatchException){
            System.out.println("");
        }

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished   
    }
}