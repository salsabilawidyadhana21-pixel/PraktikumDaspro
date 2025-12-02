import java.util.Scanner;

public class Percobaan2 {

    /**
     * Fungsi rekursif untuk menghitung pangkat (x^y).
     * @param x Bilangan yang akan dihitung pangkatnya.
     * @param y Bilangan pangkatnya.
     * @return Hasil dari x^y.
     */
    static int hitungPangkat(int x, int y) {
        // Base case: Jika pangkat y = 0, kembalikan 1 (karena x^0 = 1)
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1)); 
        }
    }

    public static void main(String[] args) {
        // Deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in); //

        // Deklarasi variabel
        int bilangan; //
        int pangkat; //

        // Menerima input dari keyboard
        System.out.print("Bilangan yang dihitung: "); //
        bilangan = sc.nextInt(); //
        System.out.print("Pangkat: "); //
        pangkat = sc.nextInt(); //

        // Memanggil fungsi hitungPangkat dan menampilkan hasilnya
        System.out.println("Hasil " + bilangan + "^" + pangkat + ": " + hitungPangkat(bilangan, pangkat)); //
        
        // Tutup scanner
        sc.close();
    }
}