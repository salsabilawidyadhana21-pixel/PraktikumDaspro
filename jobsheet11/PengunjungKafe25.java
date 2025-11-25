public class PengunjungKafe25 {

    public static void daftarPengunjung(String... namaPengunjung) {
       System.out.println("Daftar Nama Pengunjung:"); 
        for (int i = 0; i < namaPengunjung.length; i++) {
           System.out.println("-" + namaPengunjung[i]); 
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Panggilan 1 (3 argumen) ---");
        daftarPengunjung("Ali", "Budi", "Citra"); 

       
        System.out.println("\n--- Panggilan 2 (1 argumen) ---");
       daftarPengunjung("Andi"); 

        System.out.println("\n--- Panggilan 3 (4 argumen) ---");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih"); 
    }
}
