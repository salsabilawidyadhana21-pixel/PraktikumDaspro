import java.util.Scanner;

public class BioskopWithScanner25 { 
    public static void main(String[] args) {
        
        // Deklarasi variabel Scanner
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variable
        int baris, kolom;
        String nama, next;
        
        // Array of String dengan 4 baris dan 2 kolom
        String[][] penonton = new String[4][2]; 
        
        // Menggunakan scanner untuk mengisi elemen pada array penonton
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();

            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine(); 

            // Mengisi elemen array. Mengurangi 1 untuk menyesuaikan indeks (baris-1, kolom-1).
            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.println("\n--- Daftar Penonton Selesai Diinput ---");
        
        sc.close();
    }
}