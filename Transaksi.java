public class Transaksi {
    public int lama_jam;
    public int biaya;
    public int total;
    public Transaksi(){

    }
    public Transaksi(int lama_jam) {
        this.lama_jam = lama_jam;
    }

    //GETTER
    public int getLama_jam() {
        return lama_jam;
    }

    //SETTER
    public void setLama_jam(int lama_jam) {
        this.lama_jam = lama_jam;
    }

    //ambil anjing
    Anjing anjing = new Anjing();
    public Anjing getAnjing() {
        return anjing;
    }
    public int biayaAnjing(int lama_jam){
       total = anjing.biayaHewan()*lama_jam;
        return total;
    }




    //ambil kucing
    Kucing kucing = new Kucing();
    public Kucing getKucing() {
        return kucing;
    }
    public int biayaKucing(int lama_jam){
        total = kucing.biayaHewan()*lama_jam;
        return total;
    }

}
