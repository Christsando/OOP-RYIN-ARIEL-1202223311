public class FRIExpress extends Ekspedisi //...
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    public FRIExpress(int jumlahCabang, String pusat, float tarif, boolean pecahBelah){
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }

    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi(){
        if(pecahBelah){
            System.out.println("FRIExpress dengan jumlah cabang " + jumlahCabang + ", berpusat di" + pusat + ", dengan tarif " + tarif + ", tidak melayani pecah belah");
        } else {
            System.out.println("");
        }
    }

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima pake sebanyak " + jumlahPaket + " untuk disortir");
    }

    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String tujuan){
        System.out.println("FRIExpress berhasil mengirim paket ke tujuan " + tujuan);
    }

    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(String tujuan_1, String tujuan_2){
        System.out.println("FRIExpress berhasil mengirim paket ke tujuan  " + tujuan_1 + " dan " + tujuan_2);
    }
}
