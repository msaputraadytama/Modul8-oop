public class CetakSiswa2 {

    public static void main (String[] args){

        Siswa data = new Siswa();// deklarasi objek class Siswa dengan nama objek data
        data.infoSiswa(); //memanggil method main infosiswa pada class siswa

        data.no_absen = 1; //variabel no absen diberi nilai 2pada dan milik kelas siswa cetak kelas siswa2 hanaya memakai
        System.out.println("No. Absen \t\t:"+data.no_absen);

        data.setNis("16001"); // pemanggilan nama method nis pada object kelas siswa diberi nilai 16001
        System.out.println ("NIS :"+ data.nis);

        data.setNama("Melinda Aisya Fatima");
        System.out.println ("Nama Siswa \t\t:"+data.nama_siswa);

        
        data.setTtl("Pekalongan","14-08-1997" );
        System.out.println ("Tempat. Tgl Lahir: "+data.tmp_lahir +", "+data.tgl_lahir);

        
        data.setNilai(75.5, 80.75);
        System.out.println ("Nilai IPA\t\t: "+data.nilai_ipa );
        System.out.println ("Nilai IPS\t\t: "+data.nilai_ips );

    }
}