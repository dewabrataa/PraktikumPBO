package Teori;

public abstract class Staff extends Pegawai{
    private int jamKerja;
    private int jamLembur;
    
    public Staff(String npp, String nama, double gaji, 
      int jamKerja, int jamLembur){
        super(npp, nama, gaji);
        this.jamKerja = jamKerja;
        this.jamLembur = jamLembur;
    }
    public void showData(){
        
    }
    public double totalPendapatan(){
        return 0;
    }
}
