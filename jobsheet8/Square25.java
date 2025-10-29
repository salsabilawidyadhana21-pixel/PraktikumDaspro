import java.util.Scanner;

public class Square25 {
    public static void main(String[] args) {
        //Inisialisasi Scanner dan Input N
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan nilai n="); 
        int n = sc.nextInt(); 

        //Outer Loop 
        for (int iOuter = 1; iOuter <= n; iOuter++) { 

            //Inner Loop 
            for(int i = 1; i <= n; i++) { 
                System.out.print("*"); 
            }

            System.out.println(); 
        }

        sc.close();
    }
}