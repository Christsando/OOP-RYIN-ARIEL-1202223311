public class MainApp {
    public static void main(String[] args){
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi1 = new Ekspedisi(4, "Jakarta", 12000);
        ekspedisi1.informasi();
        System.out.println(" ");

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpress1 = new TelUExpress(13, "Depok", 10000, true);
        telUExpress1.informasi();
        telUExpress1.ambil("Jakarta utara");
        telUExpress1.antar(1202223311);
        telUExpress1.antar(120328,348325);
        System.out.println(" ");

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress1 = new FRIExpress(10, "Lampung", 12000, true);
        friExpress1.terima(340);
        friExpress1.informasi();
        friExpress1.kirim("Bali");
        friExpress1.kirim("Kalimantan", "Semarang");

    }
}
