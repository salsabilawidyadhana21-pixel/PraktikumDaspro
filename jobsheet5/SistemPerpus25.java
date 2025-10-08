import java.util.Scanner;

public class SistemPerpus25 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Apakah kamu punya KTM? (true/false): ");
         boolean ktm = sc.nextBoolean();
         System.out.print("Apakah kamu sudah registrasi online? (true/false): ");
         boolean regisOnline = sc.nextBoolean();

         if (ktm || regisOnline) {
            System.out.println("boleh masuk");
         }else{
            System.out.println("Maaf, kamu tidak boleh masuk");
         }
  
    }
}
    

