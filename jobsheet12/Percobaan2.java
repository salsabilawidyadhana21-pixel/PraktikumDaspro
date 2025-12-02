import java.util.Scanner;

public class Percobaan2 {

    /**
     * Fungsi rekursif untuk menghitung pangkat (x^y).
     * Fungsi ini dimodifikasi untuk mencetak deret perkalian saat melakukan ekspansi.
     * @param x Bilangan yang akan dihitung pangkatnya (Bilangan Dasar).
     * @param y Bilangan pangkatnya.
     * @return Hasil dari x^y.
     */
    static int hitungPangkat(int x, int y) {
        // Base case: Jika pangkat y = 0.
        if (y == 0) {
            // Modifikasi: Cetak '1' sebagai faktor terakhir.
            System.out.print("1"); 
            return 1;
        } else {
            // Modifikasi: Cetak bilangan dasar (x) dan operator perkalian 'x'.
            System.out.print(x + "x"); 
            
            // pemanggilan rekursif
            return x * hitungPangkat(x, y - 1); 
        }
    }

    public static void main(String[] args) {
        // Deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in); 

        // Input
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        // menampilkan prompt perhitungan sebelum pemanggilan rekursif
        System.out.print(bilangan + "^" + pangkat + " = ");

        // memanggil fungsi yang akan mencetak deret dan menghitung hasilnya
        int hasil = hitungPangkat(bilangan, pangkat);

        // menampilkan hasil akhir
        System.out.println(" = " + hasil);
        
        sc.close();
    }
}