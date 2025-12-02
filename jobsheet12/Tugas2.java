import java.util.Scanner;

public class Tugas2 {

    /**
     * Fungsi rekursif untuk menghitung penjumlahan bilangan dari 1 sampai n.
     * @param n Batas atas bilangan yang akan dijumlahkan.
     * @return Hasil penjumlahan.
     */
    static int hitungPenjumlahanRekursif(int n) {
        // Base Case: Jika n = 1, hentikan rekursi dan kembalikan 1.
        // Penjumlahan deret akan berakhir pada 1.
        if (n == 1) {
            return 1;
        } else {
            // Recursive Call: menjumlahkan n dengan hasil penjumlahan (n-1) sebelumnya.
            return n + hitungPenjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan (n) untuk dihitung jumlahnya (contoh: 8): ");
        int n = sc.nextInt();
        
        // Memanggil fungsi rekursif
        int hasil = hitungPenjumlahanRekursif(n);
        
        // Menampilkan deret perhitungan dan hasilnya
        System.out.print("Penjumlahan 1 sampai " + n + " adalah: ");
        
        // Menampilkan deret 
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        
        System.out.println(" = " + hasil);
        
        sc.close();
    }
}