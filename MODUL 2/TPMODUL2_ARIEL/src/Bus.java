public class Bus extends Kendaraan {
    // VARIABLE
    private int jumlahKursi;

    public Bus (String nomorIdentifikasi, double kecepatanMax, int kapasitasPenumpang, int jumlahKursi){
        super(nomorIdentifikasi, kecepatanMax, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    //METHOD

    @Override
    public double getKecepatanMax() {
        return super.getKecepatanMax();
    }

    @Override
    public String toString() {
        return "=======INFORMASI BUS========\n" +
                "Nomor Identifikasi : " + getNomorIndentifiksi() + "\n" +
                "Kecepatan Max      : " + getKecepatanMax() + " km/jam" +"\n" +
                "Kapasitas          : " + getKapasitasPenumpang() + "\n" +
                "Jumlah Kursi       : " + this.jumlahKursi + "\n" +
                "Waktu tempuh       : " + hitungWaktuTempuh(150)+ " Jam";
    }
}
