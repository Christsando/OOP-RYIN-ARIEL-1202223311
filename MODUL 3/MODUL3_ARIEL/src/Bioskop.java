
public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static int rows = 5;
    private static int seats_per_rows = 10;
    public static int[][] seats = new int[rows][seats_per_rows];

    // TO DO: Create 2 dimensional array to store seat reservation status
    public void reserve(int baris, int kolom){
        if (seats[baris][kolom] != 1){
            seats[baris][kolom] = 1;
        }else{
            System.out.println("Kursi yang anda pesan, sudah di reservasi orag!");
        }
    }

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[2][1] = 1;
        seats[4][3] = 1;
    }

    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int baris = 0; baris < rows; baris++){
            for (int kolom = 0; kolom < seats_per_rows ; kolom ++) {
                System.out.print(seats[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        System.out.println("");
    }
}