package soalukl;

import java.util.Scanner;

public class uklsedangno1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan bil positif
        System.out.print("Masukkan bilangan bulat positif: ");
        //input
        int n = scanner.nextInt();
        
        // Validasi input agar n adalah bil positif
        if (n < 0) {
            //tampilan
            System.out.println("Bilangan harus positif!");
            //bilangan positif
        } else {
            // Menghitung faktorial menggunakan loop
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;

                System.out.print(i);

                if (i < n) {
                    System.out.print(" x ");
                }
            }


            // Menampilkan hasil faktorial
            
            System.out.print(" = " + faktorial);
        }
        
        // Menutup scanner untuk mencegah memory leak
        scanner.close();

    }
}
