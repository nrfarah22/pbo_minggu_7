import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;

public class Customer extends Data{

    @Override
    public void displayData() {
        System.out.println("Pemilik\t\t: "+getNama());
        System.out.println("No.hp\t\t: "+getNo_hp());
        System.out.println("Alamat\t\t: "+getAlamat());
    }

    public int lama_jam;
    public int getLama_jam() {
        return lama_jam;
    }
    public void setLama_jam(int lama_jam) {
        this.lama_jam = lama_jam;
    }


    //ambil transaksi
    Transaksi transaksi = new Transaksi();
    public Transaksi getTransaksi() {
        return transaksi;
    }


    public int biayaawalAnjing(int lama_jam){
        int biaya_awal= transaksi.biayaAnjing(lama_jam)/2;
        return biaya_awal;
    }


}
