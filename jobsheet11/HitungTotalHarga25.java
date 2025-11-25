import java.util.Scanner;

public class HitungTotalHarga25 {

    // Scanner untuk menerima input dari pengguna
    static Scanner sc = new Scanner(System.in); 

    // --- (Menampilkan Menu) ---
    public static void Menu() {
        System.out.println("====== MENU RESTO KAFE ======"); 
        System.out.println("1. Kopi Hitam\t\tRp 15,000"); 
        System.out.println("2. Cappuccino\t\tRp 20,000");
        System.out.println("3. Latte\t\tRp 22,000"); 
        System.out.println("4. Teh Tarik\t\tRp 12,000"); 
        System.out.println("5. Roti Bakar\t\tRp 10,000"); 
        System.out.println("6. Mie Goreng\t\tRp 18,000"); 
        System.out.println("============================="); 
    }

    // --- PERCOBAAN 3 (Dengan Nilai Kembalian) ---
    /**
     * Fungsi untuk menghitung total harga pesanan.
     * Fungsi ini mengembalikan nilai bertipe int (total harga).
     * @param pilihanMenu Nomor menu yang dipilih (1-6)
     * @param banyakItem Jumlah item yang dipesan
     * @return Total harga pesanan
     */
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        // Array harga menu (sesuai urutan 1-6)
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000}; 

        // Cek validitas pilihan menu
        if (pilihanMenu >= 1 && pilihanMenu <= hargaItems.length) {
            // Hitung harga total
            int hargaSatuan = hargaItems[pilihanMenu - 1]; // -1 karena array dimulai dari indeks 0
            int hargaTotal = hargaSatuan * banyakItem; 
            return hargaTotal; // Mengembalikan nilai total harga
        } else {
            // Jika pilihan tidak valid
            System.out.println("Pilihan menu tidak valid.");
            return 0; 
        }
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        
        // 1. Tampilkan Menu
        Menu(); 
        
        // 2. Input dari pengguna
        System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
        // 3. Panggil fungsi yang mengembalikan nilai dan simpan hasilnya
        int totalBayar = hitungTotalHarga(pilihanMenu, banyakItem);
        
        // 4. Tampilkan hasil
        if (totalBayar > 0) {
             System.out.println("\n-------------------------------------");
             System.out.println("Total harga yang harus dibayar: Rp" + totalBayar);
             System.out.println("-------------------------------------");
        }
        
        sc.close();
    }
}