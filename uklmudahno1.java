package soalukl;

import java.util.Scanner;

public class uklmudahno1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variabel-variabel
        int jarakmin = 100;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volumemin = 10;

        //input jarak tempuh
        System.out.println("Masukkan nilai jarak tempuh");
        int jaraktempuh = input.nextInt();
        //input panjang paket
        System.out.println("Masukkan nilai panjang paket");
        int p = input.nextInt();
        //input lebar paket
        System.out.println("Masukkan nilai lebar paket");
        int l = input.nextInt();
        //input berat paket
        System.out.println("Masukkan nilai berat paket");
        int beratpaket = input.nextInt();
        //input tinggi paket
        System.out.println("Masukkan nilai tinggi paket");
        int t = input.nextInt();

        //volume paket
        int volume = p*l*t;

        //jika jarak tempuh kurang dari jarak minimal
        if (jaraktempuh <= jarakmin){
            //harga total dari harga kali berat 
            int hargatotal = harga1 * beratpaket;
            //jika volume lebih dari volume minimal
            if (volume > volumemin){
                //harga total terakhir dari harga total ditambah harga ketiga
                int hargatotal3 = hargatotal + harga3;
                //tampilan 
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal3);
                //jika volume kurang dari volume minimal
            }else if (volume <= volumemin){
                //
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal);
            }
        //jika jarak tempuh lebih dari jarak minimal
        }else if (jaraktempuh > jarakmin){
            //harga total terakhir dari harga kedua dikali berat paket
            int hargatotal2 = harga2 * beratpaket;
            //jika volume lebih dari volume minimal
            if (volume > volumemin){
                //harga total terakhir dari harga total ditambah harga ketiga
                int hargatotal3 = hargatotal2 + harga3;
                //tampilan
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal3);
            }else{
                //tampilan
                System.out.println("Biaya yang harus dibayar adalah "+hargatotal2);

            }

        }
    }
}

