public class TestTabungan{

    public static void main(String[] args ){
        Tabungan tabungan=newTabungan (5000);
        System.out.println("Saldo  Awal :" +tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang :"+tabungan.saldo);
    }
}