public class Mobil extends Kendaraan {
    // VARIABLE
    private int jumlahPintu;

    // CONSTRUCTOR
    public Mobil(String nomorIdentifkasi, double kecepatanMax, int kapasitasPenumpang,int jumlahPintu){
        // INISIALISASI
        super(nomorIdentifkasi, kecepatanMax, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    //METHOD

    @Override
    public double getKecepatanMax() {
        return super.getKecepatanMax();
    }

    @Override
    public String toString() {
        return "=======INFORMASI MOBIL========\n" +
                "Nomor Identifikasi : " + getNomorIndentifiksi() + "\n" +
                "Kecepatan Max      : " + getKecepatanMax() + " km/jam" + "\n" +
                "Kapasitas          : " + getKapasitasPenumpang() + "\n" +
                "Jumlah Pintu       : " + this.jumlahPintu + "\n" +
                "Waktu tempuh       : " + hitungWaktuTempuh(100) + " Jam";
    }
}
