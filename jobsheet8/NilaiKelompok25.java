import java.util.Scanner;

public class NilaiKelompok25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;
        
        // Variabel Tambahan untuk Modifikasi
        float maxRata = 0; // Inisialisasi rata-rata tertinggi (harus 0)
        int kelompokTerbaik = 0; // Inisialisasi nomor kelompok terbaik
        // ===================================

        i = 1;
        while (i <= 6) { 
            System.out.println("===============================");
            System.out.println("Kelompok " + i);
            System.out.println("===============================");

            totalNilai = 0; 
            
            for (j = 1; j <= 5; j++) { 
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            System.out.println("Kelompok " + i + ": nilai rata-rata " + rataNilai);
            System.out.println(); 
            
            //MODIFIKASI: Membandingkan dan Menyimpan Rata-rata Tertinggi
            if (rataNilai > maxRata) {
                maxRata = rataNilai; // Simpan nilai rata-rata baru sebagai yang tertinggi
                kelompokTerbaik = i; // Simpan nomor kelompok yang memiliki rata-rata tertinggi ini
            }
            
            i++; 
        }

        // Tampilkan Hasil Akhir di luar perulangan
        System.out.println("------------------------------------------");
        System.out.println("Kelompok dengan Rata-rata Nilai Tertinggi:");
        System.out.println("Kelompok " + kelompokTerbaik + " dengan rata-rata " + maxRata);
        System.out.println("------------------------------------------");


        sc.close();
    }
}