import java.util.Scanner;

public class Tugas3PenjualanKafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Total Keseluruhan
        int totalPelangganGlobal = 0;
        int totalItemGlobal = 0;

        // Input Jumlah Cabang 
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        
        System.out.println("\n== Input Penjualan Per Cabang");

        // Perulangan Cabang 
        for (int i = 1; i <= jumlahCabang; i++) {
            
            // Deklarasi variabel per Cabang
            int totalPelangganCabang = 0;
            int totalItemCabang = 0;
            
            System.out.println("\nCabang " + i);
            
            // Input Jumlah Pelanggan
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            
            // Perulangan pelanggan
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int itemDipesan = sc.nextInt();

                // Akumulasi item per cabang
                totalItemCabang += itemDipesan;
            }

            // Akumulasi Pelanggan per Cabang
            totalPelangganCabang += jumlahPelanggan;
            
            // Akumulasi Global
            totalPelangganGlobal += totalPelangganCabang;
            totalItemGlobal += totalItemCabang;

            // Output Ringkasan Per Cabang
            System.out.println("\nCabang " + i + ":");
            System.out.println("Pelanggan: " + totalPelangganCabang + " orang");
            System.out.println("Item terjual: " + totalItemCabang);
        }

        // Output Ringkasan Total Keseluruhan
        System.out.println("\n==================================");
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganGlobal + " orang");
        System.out.println("Item terjual: " + totalItemGlobal + " item");
        System.out.println("==================================");

        sc.close();
    }
}