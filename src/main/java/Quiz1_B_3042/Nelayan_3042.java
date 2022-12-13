package Quiz1_B_3042;

public class Nelayan_3042 extends Penduduk_3042 {
    // Attribute
    int jmlBeratIkan_3042;
    int jmlSolar_3042;
    
    // Method
    public double totalPendapatanNelayan(){
        System.out.println("Total Pendapatan  : " +((jmlBeratIkan_3042 * 8000) - (jmlSolar_3042 * 10000)) );
        return 0;
    }
    public void tampilDataNelayan(){
        System.out.println("Jumlah Berat Ikan " + jmlBeratIkan_3042);
        System.out.println("Jumlah Pakai Solar " + jmlSolar_3042);
    }
}