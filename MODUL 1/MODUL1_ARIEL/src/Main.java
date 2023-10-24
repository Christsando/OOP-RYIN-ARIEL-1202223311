import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        

        // TODO: Create Konser Object and Set the Attributes
        Konser band1 = new Konser("Noah", 13-11-2023, "Sukabirus", 100000);
        Konser band2 = new Konser("Sheila on - 7", 13-11-2023, "Gedung Sate", 10000000);
        
        // TODO: Insert Konser Object to Database


        // TODO: Display Greeting Message and Prompt User to Register


        // TODO: Create a User Object and Set the Attributes


        // TODO: Display Main Menu and Prompt User to Choose Menu
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu!");
        System.out.print("");

        System.out.println("==================================");

        System.out.print("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String Name = scanner.next();

        System.out.print("No. Handphone : ");
        int Phone_number = scanner.nextInt();
        System.out.print("");

        System.out.println("==================================");

        System.out.print("");
    }
}
