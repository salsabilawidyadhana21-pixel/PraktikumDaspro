import java.util.Scanner;

public class BioskopWithScanner25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array 4 baris dan 2 kolom 
        String[][] penonton = new String[4][2]; 
        int pilihan;
        
        while (true) {
            // Pertanyaan 2: Menampilkan Menu
            System.out.println("\n===========================");
            System.out.println("=== Menu Bioskop Mini ===");
            System.out.println("1: Input data penonton"); 
            System.out.println("2: Tampilkan daftar penonton"); 
            System.out.println("3: Exit"); 
            System.out.println("===========================");
            System.out.print("Pilih menu (1-3): ");
            
            // Pengecekan input pilihan menu 
            if (sc.hasNextInt()) {
                pilihan = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println(">>> Input tidak valid. Silakan masukkan angka pilihan (1, 2, atau 3).");
                sc.nextLine(); 
                continue; 
            }

            if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    // Logika Input Data Penonton
                    String nama, next;
                    int baris = 0, kolom = 0; // Inisialisasi awal
                    boolean kursiValid;

                    do {
                        System.out.print("\nMasukkan nama penonton: ");
                        nama = sc.nextLine();
                        
                        // Loop untuk memastikan input baris/kolom valid (Pertanyaan 3 & 4)
                        do {
                            kursiValid = true; 
                            
                            // --- INPUT BARIS & KOLOM DENGAN VALIDASI TIPE DATA ---
                            System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                            System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                            
                            // Menggunakan nextLine untuk membaca keseluruhan baris input
                            String inputBarisKolom = sc.nextLine();
                            String[] parts = inputBarisKolom.trim().split("\\s+"); // Pisahkan input (asumsi dipisahkan spasi)

                            try {
                                if (parts.length >= 2) {
                                    baris = Integer.parseInt(parts[0]);
                                    kolom = Integer.parseInt(parts[1]);
                                } else {
                                    // Coba lagi jika input tidak lengkap, atau hanya 1 angka
                                    System.out.println("!!! ERROR: Masukkan baris dan kolom (contoh: 1 2).");
                                    kursiValid = false;
                                    continue;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("!!! ERROR: Input baris dan kolom harus berupa angka.");
                                kursiValid = false;
                                continue;
                            }
                            // --- AKHIR INPUT BARIS & KOLOM DENGAN VALIDASI TIPE DATA ---

                            // Pertanyaan 3: Cek Batas Array
                            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("!!! ERROR: Nomor baris/kolom tidak tersedia. Silakan coba lagi."); 
                                kursiValid = false;
                            } 
                            // Pertanyaan 4: Cek Kursi Terisi (jika batas valid)
                            else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("!!! WARNING: Kursi tersebut sudah terisi oleh: " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain."); 
                                kursiValid = false;
                            }
                            
                        } while (!kursiValid); 

                        // Jika semua valid, masukkan nama ke array
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                    } while (next.equalsIgnoreCase("y"));
                    break;
                
                case 2:
                    // Pertanyaan 5: Tampilkan daftar penonton, ganti null dengan ***
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        String[] barisTampil = new String[penonton[i].length]; 
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Cek dan ganti null dengan *** 
                            barisTampil[j] = (penonton[i][j] == null) ? "***" : penonton[i][j]; 
                        }
                        // Tampilkan baris
                        System.out.println("Baris " + (i + 1) + ": " + String.join(" | ", barisTampil));
                    }
                    break;
                
                default:
                    System.out.println(">>> Pilihan tidak tersedia. Silakan pilih 1, 2, atau 3.");
            }
        }
        sc.close();
    }
}