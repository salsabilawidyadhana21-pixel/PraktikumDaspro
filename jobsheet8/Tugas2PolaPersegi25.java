import java.util.Scanner;

public class Tugas2PolaPersegi25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Memastikan input n minimal 3
        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();
        } while (n < 3);

        // Outer Loop (i)
        for (int i = 1; i <= n; i++) {
            
            // Inner Loop (j)
            for (int j = 1; j <= n; j++) {
                
                // Jarak dari atas (i) dan dari bawah (n - i + 1)
                int k = Math.min(i, n - i + 1);
                
                // Jarak dari kiri (j) dan dari kanan (n - j + 1)
                k = Math.min(k, j);
                k = Math.min(k, n - j + 1);

                int nilaiCetak = n - 2 * (k - 1);
                
                // Mencetak nilai, tambahkan spasi agar terbentuk kolom yang rapi
                System.out.print(nilaiCetak + " ");
            }
            
            System.out.println(); 
        }
        
        sc.close();
    }
}