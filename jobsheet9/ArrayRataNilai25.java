import java.util.Scanner;

public class ArrayRataNilai25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Deklarasi Scanner

        // Deklarasi array dan variabel
        int[] nilaiMhs = new int[10];      
        double total = 0;                  
        double rata2;                      

        // Isi array nilaiMhs dengan input pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            // Menggunakan (i+1) agar input dimulai dari "Mahasiswa ke-1"
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":"); 
            nilaiMhs[i] = sc.nextInt();
        }

        // Gunakan perulangan untuk menghitung jumlah keseluruhan nilai (total)
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i]; 
        }

        // Hitung nilai rata-rata
        // Menggunakan nilaiMhs.length sebagai pembagi (jumlah elemen)
        rata2 = total / nilaiMhs.length; 
        
        // Tampilkan hasil rata-rata
        System.out.println("Rata-rata nilai = " + rata2);

        sc.close();
    }
}