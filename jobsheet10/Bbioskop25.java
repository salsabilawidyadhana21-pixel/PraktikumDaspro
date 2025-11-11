
public class Bbioskop25 { 
    public static void main(String[] args) {
        
        // Deklarasi array 2 dimensi (4 baris, 2 kolom)
        String[][] penonton = new String[4][2]; 

        // Inisialisasi elemen array penonton
        penonton[0][0] = "Amin";    
        penonton[0][1] = "Bena";    
        penonton[1][0] = "Candra";  
        penonton[1][1] = "Dela";    
        penonton[2][0] = "Eka";     
        penonton[2][1] = "Farhan";  
        penonton[3][0] = "Gisel";   
        
        // Pertanyaan 3: Melengkapi daftar penonton
        penonton[3][1] = "Hana"; 

        // ------------------------------------------
        // Jawaban Pertanyaan 4: Menampilkan panjang array
        System.out.println("--- JAWABAN PERTANYAAN 4 ---");
        System.out.println("Panjang array penonton (Baris/Dimensi 1): " + penonton.length);
        System.out.println("Panjang baris ke-1 (Kolom/Dimensi 2): " + penonton[0].length);
        System.out.println("Panjang baris ke-2 (Kolom/Dimensi 2): " + penonton[1].length);
        System.out.println("Panjang baris ke-3 (Kolom/Dimensi 2): " + penonton[2].length);
        System.out.println("Panjang baris ke-4 (Kolom/Dimensi 2): " + penonton[3].length);

        // ------------------------------------------
        // Jawaban Pertanyaan 5: Menampilkan panjang setiap baris menggunakan for loop
        System.out.println("\n--- JAWABAN PERTANYAAN 5 (for loop) ---");
        System.out.println("Total baris: " + penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ":" + penonton[i].length);
        }

        // ------------------------------------------
        // Jawaban Pertanyaan 6: Menampilkan panjang setiap baris menggunakan foreach loop
        System.out.println("\n--- JAWABAN PERTANYAAN 6 (foreach loop) ---");
        System.out.println("Total baris: " + penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // ------------------------------------------
        // Jawaban Pertanyaan 7: Menampilkan nama penonton baris ke-3 (indeks 2) menggunakan for loop
        System.out.println("\n--- JAWABAN PERTANYAAN 7 (Baris 3, for loop) ---");
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // ------------------------------------------
        // Jawaban Pertanyaan 8: Menampilkan nama penonton baris ke-3 (indeks 2) menggunakan foreach loop
        System.out.println("\n--- JAWABAN PERTANYAAN 8 (Baris 3, foreach loop) ---");
        System.out.println("Penonton pada baris ke-3: ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        // ------------------------------------------
        // Jawaban Pertanyaan 9: Menampilkan nama penonton untuk setiap baris menggunakan for loop dan String.join
        System.out.println("\n--- JAWABAN PERTANYAAN 9 (Semua Baris) ---");
        for (int i = 0; i < penonton.length; i++) {
            // String.join(", ", penonton[i]) menggabungkan array String[] (baris i) 
            // menjadi satu string dengan pemisah ", "
            System.out.println("Penonton pada baris ke-" + (i + 1) + ":" + String.join(", ", penonton[i]));
        }
    }
}