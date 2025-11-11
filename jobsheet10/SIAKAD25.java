import java.util.Scanner;

public class SIAKAD25 { 
    public static void main(String[] args) {
        
        // Deklarasi variabel Scanner
        Scanner sc = new Scanner(System.in);
        
        // Buat array of int bernama nilai (4 siswa, 3 mata kuliah)
        int[][] nilai = new int[4][3]; 
        
        // Modifikasi langkah 6 untuk menghitung dan menampilkan nilai rata-rata setiap siswa
        for (int i = 0; i < nilai.length; i++) { // Loop untuk Siswa (Baris)
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            
            double totalPerSiswa = 0; // Variabel untuk menghitung total nilai per siswa
            
            for (int j = 0; j < nilai[i].length; j++) { // Loop untuk Mata Kuliah (Kolom)
                System.out.print("Nilai mata kuliah " + (j + 1) + ":");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j]; // Akumulasi nilai
            }
            
            // Tampilkan rata-rata siswa (dibagi 3 karena 3 mata kuliah)
            System.out.println("Nilai rata-rata: " + totalPerSiswa / 3); 
        }

        // Tambahkan kode program untuk menghitung nilai rata-rata setiap mata kuliah
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < 3; j++) { // Loop untuk Mata Kuliah (Kolom)
            double totalPerMatkul = 0; // Variabel untuk menghitung total nilai per mata kuliah
            
            for (int i = 0; i < 4; i++) { // Loop untuk Siswa (Baris)
                totalPerMatkul += nilai[i][j]; // Akumulasi nilai
            }
            
            // Tampilkan rata-rata per mata kuliah (dibagi 4 karena 4 siswa)
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        
        sc.close();
    }
}