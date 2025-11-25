public class PengunjungKafe25 {

    /**
     * * @param namaPengunjung Variabel argumen (Varargs) bertipe String
     */
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        
        for (String nama : namaPengunjung) {
            System.out.println("-" + nama);
        }
       
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        
        // Eksekusi fungsi dengan 3 argumen 
        System.out.println("--- Panggilan 1 (3 argumen) ---");
        daftarPengunjung("Ali", "Budi", "Citra");

        // Eksekusi fungsi dengan 1 argumen 
        System.out.println("\n--- Panggilan 2 (1 argumen) ---");
        daftarPengunjung("Andi");

        // Eksekusi fungsi dengan 4 argumen 
        System.out.println("\n--- Panggilan 3 (4 argumen) ---");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        
        // Eksekusi fungsi tanpa argumen (Sesuai pembahasan pertanyaan No. 4)
        System.out.println("\n--- Panggilan 4 (0 argumen) ---");
        daftarPengunjung(); 
    }
}