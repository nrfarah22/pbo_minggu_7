import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer cust = new Customer();
        Hewan hewan = new Hewan();
        Kucing kucing = new Kucing();
        Transaksi transaksi = new Transaksi();
        Karyawan kary = new Karyawan();

            System.out.println("\t\t\t|-------------------|");
            System.out.println("\t\t\t|     PET HOUSE     |");
            System.out.println("\t\t\t|-------------------|");
            System.out.println();
            int lama_jam;
            String hwn = null;


            for (int i=1; i<=2; i++)
            {
                System.out.println();
                System.out.println("      ----------");
                System.out.println("     |   MENU : |");
                System.out.println("      ----------");
                System.out.println("     1. Pendaftaran");
                System.out.println("     2. Cetak Struk");
                System.out.print("Masukkan menu = ");
                int menu = input.nextInt();
                System.out.println();
                if(menu == 1)
                {


                    System.out.println("========== PENDAFTARAN ==========");
                    System.out.print("Masukkan id customer\t\t= ");
                    int id_cust=input.nextInt();
                    cust.setId(id_cust);
                    System.out.print("Masukkan nama customer\t\t= ");
                    String nama_cust=input.next();
                    cust.setNama(nama_cust);
                    System.out.print("Masukkan nomor hp customer\t= ");
                    int nohp_cust=input.nextInt();
                    cust.setNo_hp(nohp_cust);
                    System.out.print("Masukkan alamat customer\t= ");
                    String alamat_cust= input.next();
                    cust.setAlamat(alamat_cust);

                    java.io.File filecust = new java.io.File("struk.txt");
                    try {
                        java.io.PrintWriter output = new java.io.PrintWriter(filecust);
                        output.println("ID CUSTOMER = "+id_cust);
                        output.println("\tnama customer = "+nama_cust);
                        output.println("\tNo.hp = "+nohp_cust);
                        output.println("\tAlamat = "+alamat_cust);
                        output.close();
                    }
                    catch (FileNotFoundException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println();
                    System.out.println("Jenis Hewan : ");
                    System.out.println("1. Anjing");
                    System.out.println("2. Kucing");
                    System.out.print("Masukkan jenis hewan (1/2) : ");
                    int jenis_hewan = input.nextInt();
                    if(jenis_hewan == 1)
                    {
                         hwn = "anjing";

                        System.out.println();
                        System.out.println();
                        System.out.print("Masukkan id anjing\t= ");
                        int id_hewan= input.nextInt();
                        hewan.setId_hewan(id_hewan);
                        System.out.print("Masukkan nama anjing\t= ");
                        String nama_hewan= input.next();
                        hewan.setNama_hewan(nama_hewan);
                        System.out.print("Masukkan umur anjing (tahun)\t= ");
                        int umur_hewan= input.nextInt();
                        hewan.setUmur_hewan(umur_hewan);
                        System.out.print("Masukkan gender anjing (laki / perempuan)\t= ");
                        String gender_hewan= input.next();
                        hewan.setGender_hewan(gender_hewan);
                        System.out.print("Masukkan warna dominan anjing\t= ");
                        String warna_hewan= input.next();
                        hewan.setWarna_hewan(warna_hewan);
                        System.out.print("Masukkan ras anjing\t= ");
                        String ras_hewan= input.next();
                        hewan.setRas_hewan(ras_hewan);

                        System.out.print("Masukkan lama penitipan (dalam jam) = ");
                          lama_jam= input.nextInt();
                            System.out.println("Biaya = " + transaksi.biayaAnjing(lama_jam));
                            transaksi.setLama_jam(lama_jam);
                            cust.setLama_jam(lama_jam);

                        String filehewan = "struk.txt";
                        try {
                            FileWriter output = new FileWriter(filehewan, true);
                            output.write("ID HEWAN = "+id_hewan+"\n");
                            output.write("\t"+nama_hewan+" ");
                            output.write("("+umur_hewan+" th) / ");
                            output.write(gender_hewan+" / ");
                            output.write(warna_hewan+" / ");
                            output.write(ras_hewan+" / \n");
                            output.write("\t"+lama_jam+"jam \t\t\t\t TOTAL = ");
                            output.write(transaksi.biayaAnjing(lama_jam)+"\n");
                            output.close();
                        }
                        catch (IOException ioe) {
                            System.err.println(ioe.getMessage());
                        }

                    }
                    else if(jenis_hewan == 2)
                    {
                         hwn="kucing";
                        System.out.println();
                        System.out.println();
                        System.out.print("Masukkan id kucing\t= ");
                        int id_hewan= input.nextInt();
                        hewan.setId_hewan(id_hewan);
                        System.out.print("Masukkan nama kucing\t= ");
                        String nama_hewan= input.next();
                        hewan.setNama_hewan(nama_hewan);
                        System.out.print("Masukkan umur kucing (tahun)\t= ");
                        int umur_hewan= input.nextInt();
                        hewan.setUmur_hewan(umur_hewan);
                        System.out.print("Masukkan gender kucing (laki/perempuan)\t= ");
                        String gender_hewan= input.next();
                        hewan.setGender_hewan(gender_hewan);
                        System.out.print("Masukkan warna dominan kucing\t= ");
                        String warna_hewan= input.next();
                        hewan.setWarna_hewan(warna_hewan);
                        System.out.print("Masukkan ras kucing\t= ");
                        String ras_hewan= input.next();
                        hewan.setRas_hewan(ras_hewan);

                        System.out.print("Masukkan lama penitipan (dalam jam) = ");
                        lama_jam= input.nextInt();
                        System.out.println("Biaya = " + transaksi.biayaKucing(lama_jam));
                        transaksi.setLama_jam(lama_jam);
                        cust.setLama_jam(lama_jam);
                        kucing.Grooming();

                        String filehewan = "struk.txt";
                        try {
                            FileWriter output = new FileWriter(filehewan, true);
                            output.write("ID HEWAN = "+id_hewan+"\n");
                            output.write("\t"+nama_hewan+" ");
                            output.write("("+umur_hewan+" th) / ");
                            output.write(gender_hewan+" / ");
                            output.write(warna_hewan+" / ");
                            output.write(ras_hewan+" / \n");
                            output.write("\t"+lama_jam+"jam \t\t\t\t TOTAL = ");
                            output.write(transaksi.biayaKucing(lama_jam)+"\n");
                            output.close();
                        }
                        catch (IOException ioe) {
                            System.err.println(ioe.getMessage());
                        }
                    }
                    else
                    {
                        System.out.println("Jenis Hewan Tidak Ada ...");
                    }



                    System.out.println();
                    System.out.print("Masukkan nama karyawan\t: ");
                    String nama_karyawan = input.next();
                    kary.setNama(nama_karyawan);
                    System.out.print("Masukkan Id karyawan\t: ");
                    int id_karyawan = input.nextInt();
                    kary.setId(id_karyawan);
                    System.out.print("Masukkan no hp\t\t: ");
                    int nohp_karyawan = input.nextInt();
                    kary.setNo_hp(nohp_karyawan);

                    String filekary = "struk.txt";
                    try {
                        FileWriter output = new FileWriter(filekary, true);
                        output.write("[ "+id_karyawan+" ]");
                        output.write("[ "+nama_karyawan+" ]");
                        output.write("[ "+nohp_karyawan+" ]");
                        output.close();
                    }
                    catch (IOException ioe) {
                        System.err.println(ioe.getMessage());
                    }

                }
                else if(menu == 2)
                {
                    System.out.println("\t\t\t\tPET HOUSE");
                    System.out.println("\t\t(Penitipan Hewan Peliharaan)");
                    System.out.println("================================================");
                    cust.displayData();
                    System.out.println();
                    System.out.println("Peliharaan :");
                    System.out.println("\t"+hewan.getNama_hewan());
                    System.out.println("\t"+hewan.getId_hewan());
                    System.out.println();
                    System.out.println();
                    System.out.println("================================================");
                    System.out.println("Lama penitipan\t\t\t: "+cust.getLama_jam()+" jam");
                    if(Objects.equals(hwn, "anjing"))
                    {
                        System.out.println("Total\t\t\t\t\t : Rp "+transaksi.biayaAnjing(transaksi.lama_jam));
                    }
                    else if(Objects.equals(hwn, "kucing"))
                    {
                        System.out.println("Total\t\t\t\t\t : Rp "+transaksi.biayaKucing(transaksi.lama_jam));
                    }
                    System.out.println("================================================");
                    kary.displayData();
                }
            }
        }
    }
