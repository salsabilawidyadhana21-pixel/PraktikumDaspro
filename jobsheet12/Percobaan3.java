import java.util.Scanner;

public class Percobaan3 {

    /**
     * Fungsi rekursif untuk menghitung saldo akhir investasi.
     * Diasumsikan laba 11% per tahun, sehingga saldo dihitung dengan 1.11 * saldo tahun sebelumnya.
     * @param saldo Saldo awal atau saldo pada tahun tertentu.
     * @param tahun Sisa waktu investasi dalam tahun.
     * @return Jumlah saldo setelah mendapatkan laba.
     */
    static double hitungLaba(double saldo, int tahun) {
        // Base Case: Jika sisa tahun investasi (tahun) sudah habis (<= 0), 
        // kembalikan saldo saat ini. 
        if (tahun <= 0) {
            return (saldo);
        } else {
            // Recursive Call: Saldo tahun ini adalah 1.11 kali saldo hasil 
            // pemanggilan fungsi dengan sisa tahun dikurangi 1.
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        // Deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in); 

        // Deklarasi variabel
        double saldoAwal; //
        int tahun; //

        // Menerima input saldo awal
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt(); 
        
        // Menerima input lama investasi
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc.nextInt(); 

        // Memanggil fungsi hitungLaba dan menampilkan hasilnya
        double saldoAkhir = hitungLaba(saldoAwal, tahun);

        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(saldoAkhir);
        
        sc.close();
    }
}