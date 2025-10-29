import java.util.Scanner;

public class Square25 {
    public static void main(String[] args) {
        // Deklarasi objek Scanner
        Scanner sc = new Scanner(System.in); 
        
        // Input nilai N
        System.out.print("Masukkan nilai N: "); 
        int N = sc.nextInt(); 

        // Outer Loop (iOuter=1)
        for (int iOuter = 1; iOuter <= N; iOuter++) { 
            
            // Inner Loop (i=0): Mencetak Bintang per Baris (N+1 kali)
            // i=0 dan i<=N membuat perulangan berjalan untuk i=0, 1, ..., N (N+1 iterasi)
            for(int i = 0; i <= N; i++) { 
                System.out.print("*"); // Mencetak '*' tanpa baris baru
            }

            System.out.println(); 
        }

        sc.close();
    }
}