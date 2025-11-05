import java.util.Scanner;

public class SearchNilai25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        // Input banyaknya elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: "); 
        int jmlElemen = sc.nextInt();
        
        // Deklarasi array sesuai input jumlah elemen
        int[] arrNilai = new int[jmlElemen];
        
        // Inisialisasi hasil dengan -1. Digunakan sebagai indikator 'tidak ditemukan'.
        int hasil = -1; 

        // Input isi array
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":\n"); // Menggunakan i+1 agar dimulai dari 1
            arrNilai[i] = sc.nextInt();
        }

        // Input nilai (key) yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: "); 
        int key = sc.nextInt();

        // Proses linear search
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Simpan indeks ditemukan
                break;     // Hentikan perulangan (optimasi)
            }
        }

        // Output hasil pencarian
        if (hasil != -1) {
            // Posisi mahasiswa = indeks + 1 (karena user melihatnya mulai dari 1)
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1)); 
        } else {
            // Menangani kasus jika nilai tidak ditemukan (sesuai Pertanyaan 3)
            System.out.println("Nilai yang dicari tidak ditemukan"); 
        }
        
        sc.close();
    }
}