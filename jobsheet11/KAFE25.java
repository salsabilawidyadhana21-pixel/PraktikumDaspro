public class KAFE25 {

    //  (Modifikasi) 
    /**Pertanyaan No. 6.
     * @param namaPelanggan Nama pelanggan (String)
     * @param isMember Status keanggotaan (boolean)
     * @param kodePromo Kode promo yang digunakan (String) -> Penambahan Parameter (Pertanyaan No. 6)
     */
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("==========================================");
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        // Cek Status Member (isMember)
        if (isMember) { 
            System.out.println(">>> Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        } 
        
        // LOGIKA DISKON KODE PROMO (Jawaban Pertanyaan No. 6)
        if (kodePromo.equals("DISKON50")) {
            // Tampilkan diskon 50%
            System.out.println(">>> Anda menggunakan kode promo DISKON50! Mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
             // Tampilkan diskon 30%
            System.out.println(">>> Anda menggunakan kode promo DISKON30! Mendapatkan diskon 30%!");
        } else if (!kodePromo.isEmpty()){ 
            // Tampilkan kode invalid
            System.out.println("Kode promo: " + kodePromo + " invalid atau tidak berlaku.");
        }
        // --- AKHIR LOGIKA DISKON PROMO ---
        
        System.out.println("\n====== MENU RESTO KAFE ======"); 
        System.out.println("1. Kopi Hitam\t\tRp 15,000"); 
        System.out.println("2. Cappuccino\t\tRp 20,000");
        System.out.println("3. Latte\t\tRp 22,000"); 
        System.out.println("4. Teh Tarik\t\tRp 12,000"); 
        System.out.println("5. Roti Bakar\t\tRp 10,000"); 
        System.out.println("6. Mie Goreng\t\tRp 18,000"); 
        System.out.println("============================="); 
        System.out.println("Silakan pilih menu yang Anda inginkan."); 
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        
        // Jawaban Pertanyaan No. 7
        // Pelanggan "Budi", member (true), kode promo "DISKON30"
        System.out.println("--- Panggilan Fungsi (Jawaban No. 7) ---");
        Menu("Budi", true, "DISKON30"); 
        
        System.out.println("\n");
        
        // Contoh Panggilan Tambahan: Candra, member, kode promo invalid ("HEMAT")
        System.out.println("--- Contoh Panggilan Tambahan ---");
        Menu("Candra", true, "HEMAT");
    }
}