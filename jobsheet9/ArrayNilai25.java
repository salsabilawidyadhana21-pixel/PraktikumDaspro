import java.util.Scanner;

public class ArrayNilai25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Deklarasi array nilaiAkhir dengan kapasitas 10 elemen
        int[] nilaiAkhir = new int[10]; 

        // Perulangan untuk menerima input dan mengisi elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Modifikasi (Pertanyaan 4): Menampilkan status kelulusan semua mahasiswa
        System.out.println("\n===== Hasil Status Kelulusan =====");
        
        // Perulangan untuk memeriksa setiap elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            // Pengecekan kondisi: apakah nilai lebih besar dari 70?
            if (nilaiAkhir[i] > 70) {
                // Jika BENAR (Lulus)
                System.out.println("Mahasiswa ke-" + i + " lulus!"); 
            } else {
                // Jika SALAH (Tidak Lulus, nilai <= 70)
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!"); 
            }
        }
        
        sc.close();
    }
}