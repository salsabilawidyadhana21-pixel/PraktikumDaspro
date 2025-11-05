import java.util.Scanner;

public class Tugas2PemesananKafe25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan yang akan diinput: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        // 2. Deklarasi array satu dimensi untuk nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        // Input nama dan harga untuk masing-masing pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Harga Pesanan (contoh: 15000): ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 
            
            // Hitung total biaya
            totalBiaya += hargaPesanan[i]; 
        }

        // 3. Tampilkan daftar pesanan dan total biaya
        System.out.println("\n==================================");
        System.out.println("           DAFTAR PESANAN         ");
        System.out.println("==================================");
        System.out.printf("%-25s | %s\n", "NAMA PESANAN", "HARGA");
        System.out.println("----------------------------------");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-25s | Rp%d\n", namaPesanan[i], hargaPesanan[i]);
        }
        
        System.out.println("----------------------------------");
        System.out.printf("%-25s | Rp%d\n", "TOTAL BIAYA KESELURUHAN", totalBiaya);
        System.out.println("==================================");

        sc.close();
    }
}