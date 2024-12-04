package soalukl;

import java.util.Random;
import java.util.Scanner;

public class uklsedangno3 {
 
    public static void main(String[] args) {
        //input scanner
            Scanner scanner = new Scanner(System.in);
            //random
            Random random = new Random();

            //variabel-variabel
            char operator;
            int bilangan1, bilangan2, jawabanBenar, jawabanUser;
            boolean lanjut = true;
    
            while (lanjut) {
                
                //bilangan random
                bilangan1 = random.nextInt(50) ; 
                bilangan2 = random.nextInt(50) ;
                //operasi random
                int operatorInt = random.nextInt(5);
                //operasi perkalian
                if (operatorInt == 0) {
                    operator = '*';
                    //operasi pembagian
                } else if (operatorInt == 1) {
                    operator = '/';
                    //jika bilangan kedua sama dengan 0
                    while (bilangan2 == 0) {
                        //maka ditambah nilai lagi
                        bilangan2 = random.nextInt(10) + 1;
                    }
                    //selain itu
                } else if (operatorInt == 2) {
                    operator = '%';
                }else if (operatorInt == 3) {
                    operator = '+';
                }else if (operatorInt == 4) {
                    operator = '-';
                
                    
                    
                
    
                //perhitungan operasi perkalian
                if (operator == '*') {
                    jawabanBenar = bilangan1 * bilangan2;
                    //perhitungan operasi pembagian
                } else if (operator == '/') {
                    jawabanBenar = bilangan1 / bilangan2;
                    //perhitungan operasi kelipatan
                } else if (operator == '%') {
                    jawabanBenar = bilangan1 % bilangan2;
                }else if (operator == '+') {
                    jawabanBenar = bilangan1 + bilangan2;
                }else{
                    jawabanBenar = bilangan1 - bilangan2;
                }
    
                //pemberian soal
                System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
                //jawaban lewat input
                jawabanUser = scanner.nextInt();
    
                //jika jawaban benar
                if (jawabanUser == jawabanBenar) {
                    System.out.println("Jawaban Anda benar!");
                    //jika jawaban salah
                } else {
                    System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
                }

                //melanjutkan atau tidak
                System.out.print("Ingin melanjutkan? (1. ya / 2. tidak): ");
                //input
                int pilihan = scanner.nextInt();
                //jika pilihan 1 maka stop dan jika pilihan 2 maka lanjut
                if (pilihan == 2) {
                    lanjut = false;
                }
                System.out.println("Terima kasih telah bermain!");
            }

        
    }
}
}