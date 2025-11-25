import java.util.Scanner;

public class NilaiMahasiswa25 {
    static Scanner sc = new Scanner(System.in);

    /*** Mengisi elemen-elemen array dengan nilai yang diinputkan.
     * @param nilaiArray Array 1 dimensi bertipe double untuk diisi nilai.
     */
    public static void isianArray(double[] nilaiArray) {
        System.out.println("\n--- Memulai Pengisian Nilai Mahasiswa ---");
        // Loop sebanyak jumlah elemen array (N)
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            // Menggunakan nextDouble untuk menerima nilai desimal
            nilaiArray[i] = sc.nextDouble(); 
        }
        System.out.println("Pengisian nilai selesai.\n");
    }
    /*** Menerima parameter berupa array nilai mahasiswa dan menampilkannya.
     * @param nilaiArray Array 1 dimensi nilai mahasiswa.
     */
    public static void tampilArray(double[] nilaiArray) {
        System.out.println("--- Daftar Nilai Mahasiswa ---");
        // Loop untuk menampilkan setiap elemen
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.printf("Mahasiswa ke-%d : %.2f\n", (i + 1), nilaiArray[i]);
        }
        System.out.println("------------------------------\n");
    }
    /*** Menerima parameter berupa array nilai mahasiswa, menghitung dan mengembalikan total nilainya.
     * Menggunakan tipe data double untuk return value.
     * @param nilaiArray Array 1 dimensi nilai mahasiswa.
     * @return Total nilai seluruh mahasiswa (double).
     */
    public static double hitTot(double[] nilaiArray) {
        double totalNilai = 0;
        // Loop untuk menjumlahkan semua elemen array
        for (double nilai : nilaiArray) {
            totalNilai += nilai;
        }
        return totalNilai; 
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        
        System.out.println("====== PROGRAM OLAH NILAI MAHASISWA ======");
        
        // Membaca nilai N (jumlah mahasiswa) 
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        
        // Memastikan N positif
        if (N <= 0) {
            System.out.println("Jumlah mahasiswa (N) harus lebih dari nol.");
            sc.close();
            return;
        }

       // Membuat array dengan ukuran N
        double[] nilaiMahasiswa = new double[N];

        // Memanggil fungsi isianArray 
        isianArray(nilaiMahasiswa);

        // Memanggil fungsi tampilArray 
        tampilArray(nilaiMahasiswa);

        // Memanggil fungsi hitTot dan menyimpan nilai kembalian 
        double totalNilaiKeseluruhan = hitTot(nilaiMahasiswa);

        // Menampilkan total nilai yang dikembalikan oleh fungsi hitTot 
        System.out.println("=====================================");
        System.out.printf("Total Nilai Keseluruhan Mahasiswa: %.2f\n", totalNilaiKeseluruhan);
        System.out.println("=====================================");

        sc.close();
    }
}
