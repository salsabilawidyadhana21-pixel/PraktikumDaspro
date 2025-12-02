import java.util.Scanner;

public class Tugas1 {

    /**
     * Fungsi rekursif untuk menampilkan deret bilangan dari n sampai 0.
     * @param n Bilangan awal.
     */
    static void deretDescendingRekursif(int n) {
        // Base Case: Jika n sudah kurang dari 0, hentikan rekursi
        if (n < 0) {
            return;
        } else {
            // Cetak n saat ini
            System.out.print(n + " ");
            
            // Recursive Call: Panggil diri sendiri dengan n-1
            deretDescendingRekursif(n - 1);
        }
    }

    /**
     * Fungsi iteratif untuk menampilkan deret bilangan dari n sampai 0.
     * @param n Bilangan awal.
     */
    static void deretDescendingIteratif(int n) {
        // Loop dari n (bilangan awal) sampai 0 (i >= 0)
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // Baris baru setelah selesai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai awal (n): ");
        int n = sc.nextInt();
        
        System.out.println("\n--- Deret Descending menggunakan Rekursif ---");
        deretDescendingRekursif(n);
        System.out.println(); // Untuk memastikan baris baru setelah rekursi

        System.out.println("\n--- Deret Descending menggunakan Iteratif ---");
        deretDescendingIteratif(n);
        
        sc.close();
    }
}
