import java.util.Scanner;

public class SIAKAD25 { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3]; 
        
        // --- LOOP INPUT DAN HITUNG RATA-RATA SISWA (BARIS) ---
        for (int i = 0; i < nilai.length; i++) { // Menggunakan nilai.length (dinamis)
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            
            double totalPerSiswa = 0; 
            
            for (int j = 0; j < nilai[i].length; j++) { // Menggunakan nilai[i].length (dinamis)
                System.out.print("Nilai mata kuliah " + (j + 1) + ":");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j]; 
            }
            
            // Menggunakan nilai[i].length sebagai pembagi (dinamis)
            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length); 
        }

        // --- LOOP HITUNG RATA-RATA MATA KULIAH (KOLOM) ---
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah (Dinamis):");

        // Batas loop j menggunakan nilai[0].length (dinamis)
        for (int j = 0; j < nilai[0].length; j++) { 
            double totalPerMatkul = 0; 
            
            // Batas loop i menggunakan nilai.length (dinamis)
            for (int i = 0; i < nilai.length; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            
            // Menggunakan nilai.length sebagai pembagi (dinamis)
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
        
        sc.close();
    }
}