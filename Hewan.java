public class Hewan {
    public int id_hewan;
    protected String nama_hewan;
    protected int umur_hewan;
    protected String gender_hewan;
    protected String warna_hewan;
    protected String ras_hewan;

    //CONSTRUCTOR
    public Hewan(){

    }
    public Hewan(int id_hewan, String nama_hewan, int umur_hewan, String gender_hewan, String warna_hewan, String ras_hewan) {
        this.id_hewan = id_hewan;
        this.nama_hewan = nama_hewan;
        this.umur_hewan = umur_hewan;
        this.gender_hewan = gender_hewan;
        this.warna_hewan = warna_hewan;
        this.ras_hewan = ras_hewan;
    }

    //GETTER
    public int getId_hewan() {
        return id_hewan;
    }
    public String getNama_hewan() {
        return nama_hewan;
    }
    public int getUmur_hewan() {
        return umur_hewan;
    }
    public String getGender_hewan() {
        return gender_hewan;
    }
    public String getWarna_hewan() {
        return warna_hewan;
    }
    public String getRas_hewan() {
        return ras_hewan;
    }

    //SETTER
    public void setId_hewan(int id_hewan) {
        this.id_hewan = id_hewan;
    }
    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }
    public void setUmur_hewan(int umur_hewan) {
        this.umur_hewan = umur_hewan;
    }
    public void setGender_hewan(String gender_hewan) {
        this.gender_hewan = gender_hewan;
    }
    public void setWarna_hewan(String warna_hewan) {
        this.warna_hewan = warna_hewan;
    }
    public void setRas_hewan(String ras_hewan) {
        this.ras_hewan = ras_hewan;
    }


}
