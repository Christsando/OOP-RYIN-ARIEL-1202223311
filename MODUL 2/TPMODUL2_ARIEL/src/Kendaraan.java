public class Kendaraan {
    // VARIABLE
    private String nomorIndentifiksi;
    private double kecepatanMax;
    private int kapasitasPenumpang;

    //CONSTRUCTOR
    public Kendaraan (String nomorIdentifikasi, double kecepatanMax, int kapasitasPenumpang){
        // INSIALISASI VARIBLE
        this.nomorIndentifiksi = nomorIdentifikasi;
        this.kecepatanMax = kecepatanMax;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    //METHOD
    public String getNomorIndentifiksi() {
        return nomorIndentifiksi;
    }

    public double getKecepatanMax() {
        return kecepatanMax;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public String hitungWaktuTempuh(double jarak){
        double waktuTempuh = jarak/getKecepatanMax();
        return String.format("%.2f", waktuTempuh);
    }

    public String toString(){
        return toString();
    }
}
