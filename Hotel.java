 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ihsan_19092022;

/**
 *
 * @author ASUS
 */
public class Hotel {
    private String kodePesan;
    private String tglPesan;
    private String kodePelanggan; 
    private int jenisKamar;
    private double tarif;
    private double diskon;
    private double total;

    public String getKodePesan() {
        return kodePesan;
    }

    public void setKodePesan(String kodePesan) {
        this.kodePesan = kodePesan;
    }

    public String getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }
    
    public String getKodePelanggan() {
        return kodePelanggan;
    }
    
    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public int getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(int jenisKamar) {
        if (jenisKamar==1){
            tarif=600000;
            diskon=((tarif * 2)/100);
            total=(tarif - diskon);
        }
        else if (jenisKamar==2){
            tarif=700000;
            diskon=((tarif * 3)/100);
            total=(tarif - diskon);
        }
        else
            System.out.println(" Mohon Maaf Jenis Kamar Tidak Tersedia");
        this.jenisKamar = jenisKamar;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

     public void print(){
       System.out.println("\tSelamat Datang Di Hotel");
       System.out.println("**********************************************************");
       System.out.println("Kode Pesan           : "+kodePesan);
       System.out.println("Tanggal Pesan        : "+tglPesan);
       System.out.println("Kode Pelanggan       : "+kodePelanggan);
       System.out.println("Jenis Kamar          : "+jenisKamar);
       System.out.println("Tarif                :Rp  "+tarif);
       System.out.println("Diskon               :Rp  "+diskon);
       System.out.println("Total Pembayaran     :Rp  "+total);
       System.out.println("\n**********************************************************");
   }
}

    

