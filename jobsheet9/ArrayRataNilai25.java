import java.util.Scanner;

public class ArrayRataNilai25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        // Minta input jumlah elemen array
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        
        // Deklarasi array dengan ukuran sesuai input pengguna
        int[] nilaiMhs = new int[jumlahMhs]; 

        // Deklarasi variabel untuk perhitungan rata-rata LULUS dan TIDAK LULUS
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        // Isi array nilaiMhs dan hitung total per kategori
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":"); 
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        // Hitung dan tampilkan rata-rata LULUS
        if (jmlLulus > 0) {
            double rata2Lulus = totalLulus / jmlLulus;
            System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        } else {
            System.out.println("Rata-rata nilai lulus = 0.0 (Tidak ada yang lulus)");
        }

        // Hitung dan tampilkan rata-rata TIDAK LULUS
        if (jmlTidakLulus > 0) {
            double rata2TidakLulus = totalTidakLulus / jmlTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        } else {
            System.out.println("Rata-rata nilai tidak lulus = 0.0 (Semua lulus)");
        }
        
        sc.close();
    }
}