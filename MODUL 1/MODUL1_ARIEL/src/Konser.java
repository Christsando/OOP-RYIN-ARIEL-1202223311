import java.sql.Date;

public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Nama_band, Lokasi;
    private Date Tanggal;
    private int Harga_ticket;

    public Konser(String nama_band, Date Tanggal, String Lokasi, int Harga_ticket){
        this.Nama_band = nama_band;
        this.Tanggal = Tanggal;
        this.Lokasi = Lokasi;
        this.Harga_ticket = Harga_ticket;
    }
    
    // Setter Section
    public void setHarga_ticket(int harga_ticket) {
        Harga_ticket = harga_ticket;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public void setNama_band(String nama_band) {
        Nama_band = nama_band;
    }

    public void setTanggal(Date tanggal) {
        Tanggal = tanggal;
    }


    // Getter Section
    public String getNama_band() {
        return Nama_band;
    }

    public int getHarga_ticket() {
        return Harga_ticket;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public Date getTanggal() {
        return Tanggal;
    }
}
