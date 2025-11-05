import java.util.Scanner;

public class ArrayRataNilai25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] nilaiMhs = new int[10];      
        double total = 0;                  
        double rata2;                      
        int lulus = 0; // Tambahkan variabel untuk menghitung jumlah yang lulus

        // Isi array nilaiMhs dengan input pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":"); 
            nilaiMhs[i] = sc.nextInt();
        }

        // Hitung total dan jumlah yang lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i]; 
            
            // Untuk menghitung yang lulus
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        // Hitung nilai rata-rata
        rata2 = total / nilaiMhs.length; 
        
        System.out.println("Rata-rata nilai = " + rata2);
        // Tampilkan jumlah mahasiswa yang lulus
        System.out.println("Banyaknya mahasiswa yang lulus adalah: " + lulus);

        sc.close();
    }
}