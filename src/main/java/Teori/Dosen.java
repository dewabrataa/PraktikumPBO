package Teori;

public abstract class Dosen extends Pegawai{
    private int jumlahMatkul;
    private int jumlahSertifikasi;
    
    public Dosen(String npp, String nama, double gaji, 
      int jumlahMatkul, int jumlahSertifikasi){
        super(npp, nama, gaji);
        this.jumlahMatkul = jumlahMatkul;
        this.jumlahSertifikasi = jumlahSertifikasi;
    }
    public void showData(){
        
    }
    public double totalPendapatan(){
        return 0;
    }
}
