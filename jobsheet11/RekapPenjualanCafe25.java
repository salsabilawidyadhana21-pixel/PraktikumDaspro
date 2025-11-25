import java.util.Scanner;

public class RekapPenjualanCafe25 {

    static Scanner sc = new Scanner(System.in);

    /*** Menginputkan nama menu dan data penjualan (isi array 2D) dari pengguna.
     * (modifikasi 3b dengan input pengguna)
     */
    public static void inputDataPenjualan(int[][] dataPenjualan, String[] namaMenu, int JUMLAH_MENU, int JUMLAH_HARI) {
        System.out.println("\n--- Memulai Input Data Penjualan (modifikasi 3b dengan input pengguna) ---");

        // Input Nama Menu
        sc.nextLine(); 
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        // Input Data Penjualan (isi array 2D)
        System.out.println("\n--- Masukkan Jumlah Penjualan per Hari ---");
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.println("Menu: " + namaMenu[i]);
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.printf("  Penjualan Hari ke-%d: ", j + 1);
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input data penjualan selesai.\n");
    }

    /*** Menampilkan seluruh data penjualan dari array 2D dalam bentuk tabel.
     */
    public static void tampilkanDataPenjualan(int[][] dataPenjualan, String[] namaMenu, int JUMLAH_MENU, int JUMLAH_HARI) {
        System.out.println("==================================================================");
        System.out.println("                 REKAP PENJUALAN CAFE");
        System.out.println("==================================================================");
        
        // Header Tabel
        System.out.printf("%-18s", "MENU");
        for (int j = 0; j < JUMLAH_HARI; j++) {
            System.out.printf("| HARI %d ", j + 1);
        }
        System.out.println("| TOTAL");
        System.out.println("------------------------------------------------------------------");

        // Isi Tabel dan Hitung Total
        for (int i = 0; i < JUMLAH_MENU; i++) {
            int totalPenjualanMenu = 0;
            
            System.out.printf("%-18s", namaMenu[i]);
            
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.printf("| %-6d ", dataPenjualan[i][j]);
                totalPenjualanMenu += dataPenjualan[i][j];
            }
            System.out.printf("| %-5d", totalPenjualanMenu);
            System.out.println();
        }
        System.out.println("==================================================================\n");
    }

    /*** Mencari dan menampilkan menu dengan total penjualan tertinggi.
     */
    public static void cariPenjualanTertinggi(int[][] dataPenjualan, String[] namaMenu, int JUMLAH_MENU, int JUMLAH_HARI) {
        int maxTotal = -1;
        int indeksMenuTertinggi = -1;

        System.out.println("--- MENU DENGAN TOTAL PENJUALAN TERTINGGI ---");

        for (int i = 0; i < JUMLAH_MENU; i++) {
            int totalPenjualanMenu = 0;
            // Menghitung total penjualan menu ke-i
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalPenjualanMenu += dataPenjualan[i][j];
            }

            // Membandingkan untuk mencari yang tertinggi
            if (totalPenjualanMenu > maxTotal) {
                maxTotal = totalPenjualanMenu;
                indeksMenuTertinggi = i;
            }
        }

        if (indeksMenuTertinggi != -1) {
            System.out.println("Menu Terlaris   : " + namaMenu[indeksMenuTertinggi]);
            System.out.println("Total Penjualan : " + maxTotal + " item.");
        } else {
             System.out.println("Data penjualan tidak ditemukan.");
        }
        System.out.println("----------------------------------------------\n");
    }

    /*** Menghitung dan menampilkan rata-rata penjualan harian untuk setiap menu.
     */
    public static void tampilkanRataRataPenjualan(int[][] dataPenjualan, String[] namaMenu, int JUMLAH_MENU, int JUMLAH_HARI) {
        System.out.println("--- RATA-RATA PENJUALAN HARIAN UNTUK SETIAP MENU ---");

        for (int i = 0; i < JUMLAH_MENU; i++) {
            int totalPenjualanMenu = 0;
            
            // Menghitung total penjualan
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalPenjualanMenu += dataPenjualan[i][j];
            }

            // Menghitung rata-rata
            double rataRata = (double) totalPenjualanMenu / JUMLAH_HARI;

            System.out.printf("%-18s : %.2f item per hari\n", namaMenu[i], rataRata);
        }
        System.out.println("---------------------------------------------------\n");
    }

    // --- FUNGSI UTAMA (MAIN) ---
    public static void main(String[] args) {
        
        System.out.println("====== PROGRAM OLAH REKAP PENJUALAN CAFE ======");
        
        // MODIFIKASI 3B DENGAN INPUT PENGGUNA
        System.out.print("Masukkan jumlah menu yang akan diolah (N): ");
        int JUMLAH_MENU = sc.nextInt();
        
        System.out.print("Masukkan jumlah hari penjualan: ");
        int JUMLAH_HARI = sc.nextInt();

        // Deklarasi array berdasarkan input pengguna
        int[][] dataPenjualan = new int[JUMLAH_MENU][JUMLAH_HARI];
        String[] namaMenu = new String[JUMLAH_MENU];

        // Memanggil fungsi input data penjualan
        inputDataPenjualan(dataPenjualan, namaMenu, JUMLAH_MENU, JUMLAH_HARI);
        
        // Memanggil fungsi-fungsi pengolahan data
        tampilkanDataPenjualan(dataPenjualan, namaMenu, JUMLAH_MENU, JUMLAH_HARI);
        cariPenjualanTertinggi(dataPenjualan, namaMenu, JUMLAH_MENU, JUMLAH_HARI);
        tampilkanRataRataPenjualan(dataPenjualan, namaMenu, JUMLAH_MENU, JUMLAH_HARI);

        sc.close();
    }
}