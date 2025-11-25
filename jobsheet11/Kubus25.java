import java.util.Scanner;

public class Kubus25 {

    /*** Menghitung volume kubus.
     * @param sisi Panjang sisi kubus (double)
     * @return Volume kubus (double)
     */
    public static double hitungVolume(double sisi) {
        // Rumus Volume (V) = sisi * sisi * sisi
        return sisi * sisi * sisi;
    }

    /*** Menghitung luas permukaan kubus.
     * @param sisi Panjang sisi kubus (double)
     * @return Luas permukaan kubus (double)
     */
    public static double hitungLuasPermukaan(double sisi) {
        // Rumus Luas Permukaan (LP) = 6 * sisi * sisi
        return 6 * sisi * sisi;
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== PROGRAM HITUNG KUBUS ======");
        
        // 1. Input panjang sisi dari pengguna
        System.out.print("Masukkan panjang sisi kubus (cm): ");
        
        // Menggunakan nextDouble agar bisa menerima input desimal
        if (sc.hasNextDouble()) {
            double sisi = sc.nextDouble();

            if (sisi > 0) {
                // 2. Memanggil fungsi hitungVolume
                double volume = hitungVolume(sisi);
                
                // 3. Memanggil fungsi hitungLuasPermukaan
                double luasPermukaan = hitungLuasPermukaan(sisi);

                // 4. Menampilkan hasil
                System.out.println("\n--- Hasil Perhitungan ---");
                System.out.printf("Panjang Sisi           : %.2f cm\n", sisi);
                System.out.printf("Volume Kubus           : %.2f cm³\n", volume);
                System.out.printf("Luas Permukaan Kubus   : %.2f cm²\n", luasPermukaan);
                System.out.println("-------------------------");
            } else {
                System.out.println("Sisi kubus harus bernilai positif.");
            }
        } else {
             System.out.println("Input tidak valid. Harap masukkan angka.");
        }
        
        sc.close();
    }
}