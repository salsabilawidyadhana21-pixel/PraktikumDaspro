import java.util.Scanner;

public class Tugas3CariMenuKafe25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Daftar menu makanan yang telah ditentukan (inisialisasi array)
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"}; //

        // 2. Input nama makanan yang ingin dicari
        System.out.println("--- MENU CAFE KAMI ---");
        System.out.println("Menu tersedia: Nasi Goreng, Mie Goreng, Roti Bakar, ...");
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        // 3. Proses Linear Search
        int indeksDitemukan = -1; // Inisialisasi -1 (tidak ditemukan)

        for (int i = 0; i < menu.length; i++) {
            // Menggunakan equalsIgnoreCase untuk pencarian yang tidak sensitif huruf besar/kecil
            if (cariMakanan.equalsIgnoreCase(menu[i])) { 
                indeksDitemukan = i; // Simpan indeks ditemukan
                break;               // Hentikan perulangan
            }
        }

        // 4. Output hasil pencarian
        System.out.println("\n--- HASIL PENCARIAN ---");
        if (indeksDitemukan != -1) {
            System.out.println("Makanan/Minuman \"" + menu[indeksDitemukan] + "\" tersedia di menu!"); //
        } else {
            System.out.println("Maaf, makanan/minuman \"" + cariMakanan + "\" tidak ada di menu."); //
        }
        
        sc.close();
    }
}
