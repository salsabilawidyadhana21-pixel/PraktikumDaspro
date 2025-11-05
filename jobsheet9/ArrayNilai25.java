import java.util.Scanner;

public class ArrayNilai25 { 
    public static void main(String[] args) {
        // Deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in); 

        // Deklarasi array nilaiAkhir dengan kapasitas 10
        int[] nilaiAkhir = new int[10];

        // Perulangan untuk menerima input dan mengisi elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Perulangan untuk menampilkan semua isi elemen array
        System.out.println("\nHasil Input:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70)
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
        
        sc.close();
    }
}