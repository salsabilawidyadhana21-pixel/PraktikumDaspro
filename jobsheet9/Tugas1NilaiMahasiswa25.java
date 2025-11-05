import java.util.Scanner;

public class Tugas1NilaiMahasiswa25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double totalNilai = 0;
        
        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            totalNilai += nilaiMahasiswa[i]; 
        }

        // Menghitung nilai rata-rata
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("\n===== Daftar Nilai =====");
        System.out.print("Semua Nilai: [");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(nilaiMahasiswa[i] + (i < jumlahMahasiswa - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        // Menampilkan nilai tertinggi dan nilai terendah
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        System.out.println("Nilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);

        sc.close();
    }
}