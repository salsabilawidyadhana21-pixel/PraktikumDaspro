public class KAFE25 {

    // Fungsi Menu() dimodifikasi dengan dua parameter
    public static void Menu(String namaPelanggan, boolean isMember) { // 
        
        // Cek status keanggotaan menggunakan parameter isMember
        if (isMember) { 
            System.out.println("Selamat datang, " + namaPelanggan + "!"); 
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!"); 
        } 

        System.out.println("\n====== MENU RESTO KAFE ======"); 
        System.out.println("1. Kopi Hitam\t\tRp 15,000"); 
        System.out.println("2. Cappuccino\t\tRp 20,000"); 
        System.out.println("3. Latte\t\tRp 22,000"); 
        System.out.println("4. Teh Tarik\t\tRp 12,000"); 
        System.out.println("5. Roti Bakar\t\tRp 10,000"); 
        System.out.println("6. Mie Goreng\t\tRp 18,000"); 
        System.out.println("============================="); 
        System.out.println("Silakan pilih menu yang Anda inginkan."); 
    }

    // Fungsi main() akan memanggil Menu() dengan argumen
    public static void main(String[] args) {
        // Eksekusi fungsi Menu() dengan memberikan nilai untuk parameter
        Menu("Andi", true); // 
    }
}