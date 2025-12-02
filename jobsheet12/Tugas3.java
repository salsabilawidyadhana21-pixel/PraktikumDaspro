import java.util.Scanner;

public class Tugas3 {

    /**
     * @param bulan Bulan ke-n.
     * @return Jumlah pasangan marmut pada bulan tersebut.
     */
    static int hitungMarmut(int bulan) {
        // Base Case 1: Bulan 1 dan Bulan 2, jumlah pasangan adalah 1
        // Karena pasangan baru lahir dan belum produktif (perlu 2 bulan untuk produktif).
        if (bulan <= 2) { 
            return 1; 
        } else {
            // Recursive Call: Jumlah pasangan saat ini adalah jumlah pasangan 
            // pada bulan sebelumnya (bulan-1) ditambah jumlah pasangan 
            // pada dua bulan sebelumnya (bulan-2).
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Target yang diminta dalam soal adalah bulan ke-12
        int targetBulan = 12;

        System.out.println("--- Perhitungan Pasangan Marmut (Fibonacci Rekursif) ---");
        System.out.println("Target: Bulan ke-" + targetBulan);
        
        // Memanggil fungsi rekursif
        int totalPasangan = hitungMarmut(targetBulan);
        
        System.out.println("\nJumlah pasangan marmut pada akhir bulan ke-" + targetBulan + " adalah: " + totalPasangan);
        
        sc.close();
    }
}