import java.util.Scanner;

public class HitungTotalHarga25 {

    static Scanner sc = new Scanner(System.in); 
    public static void Menu() {
        System.out.println("\n====== MENU RESTO KAFE ======"); 
        System.out.println("1. Kopi Hitam\t\tRp 15,000"); 
        System.out.println("2. Cappuccino\t\tRp 20,000");
        System.out.println("3. Latte\t\tRp 22,000"); 
        System.out.println("4. Teh Tarik\t\tRp 12,000"); 
        System.out.println("5. Roti Bakar\t\tRp 10,000"); 
        System.out.println("6. Mie Goreng\t\tRp 18,000"); 
        System.out.println("============================="); 
    }

    // --- (Modifikasi Jawaban No. 3) ---
    /**
     * Fungsi untuk menghitung total harga pesanan, termasuk diskon dari kode promo.
     * @param pilihanMenu Nomor menu yang dipilih (1-6)
     * @param banyakItem Jumlah item yang dipesan
     * @param kodePromo Kode promo yang dimasukkan (String) -> Penambahan Parameter
     * @return Total harga pesanan setelah diskon (int)
     */
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000}; 
        int totalHarga = 0;
        double diskon = 0.0;
        
        // Cek validitas pilihan menu dan hitung harga dasar
        if (pilihanMenu >= 1 && pilihanMenu <= hargaItems.length) {
            totalHarga = hargaItems[pilihanMenu - 1] * banyakItem; 
        } else {
            System.out.println("  > Pilihan menu tidak valid. Pesanan ini diabaikan.");
            return 0; 
        }

        // DISKON KODE PROMO (Jawaban Pertanyaan No. 3)
        if (kodePromo.equals("DISKON50")) {
            diskon = totalHarga * 0.50; // Diskon 50%
            totalHarga -= (int)diskon;
            System.out.printf("  > Kode Promo 'DISKON50' berhasil. Diskon: Rp%,.0f\n", diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = totalHarga * 0.30; // Diskon 30%
            totalHarga -= (int)diskon;
            System.out.printf("  > Kode Promo 'DISKON30' berhasil. Diskon: Rp%,.0f\n", diskon);
        } else if (!kodePromo.isEmpty()){
            System.out.println("  > Kode promo '" + kodePromo + "' invalid. Tidak ada diskon diterapkan.");
        }
        
        // Menampilkan subtotal pesanan ini
        System.out.println("  > Subtotal Pesanan Ini: Rp" + totalHarga);

        // Kembalikan Total Harga Akhir Setelah Diskon
        return totalHarga; 
    }

    // --- FUNGSI UTAMA (MAIN) ---
    // Modifikasi untuk multi-menu menggunakan perulangan (Jawaban No. 4)
    public static void main(String[] args) {
        
        // Akumulator untuk menampung total dari semua pesanan (Jawaban No. 4)
        int grandTotal = 0; 
        String pesanLagi;
        
        System.out.println("====== PROGRAM PEMESANAN KAFE (MULTI-MENU) ======");

        do {
            Menu(); // Menampilkan Menu
            
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();
            
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            sc.nextLine(); 
            System.out.print("Masukkan Kode Promo (kosongkan jika tidak ada): ");
            String kodePromo = sc.nextLine().toUpperCase();
            
            // Memanggil fungsi yang dimodifikasi (Jawaban No. 3)
            int subTotal = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            
            // Menambahkan subTotal ke grandTotal (Akumulasi Jawaban No. 4)
            grandTotal += subTotal;
            
            // Pertanyaan untuk mengulang (Jawaban No. 4)
            System.out.print("Apakah Anda ingin memesan menu lain? (y/t): ");
            pesanLagi = sc.next();
            
            System.out.println("-------------------------------------");
            
        } while (pesanLagi.equalsIgnoreCase("y")); 

        // Menampilkan Total Keseluruhan Pesanan (Jawaban No. 4)
        System.out.println("\n=====================================");
        System.out.println("TOTAL KESELURUHAN PESANAN ANDA: Rp" + grandTotal);
        System.out.println("=====================================");
        
        sc.close();
    }
}