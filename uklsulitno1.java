package soalukl;

import java.util.Scanner;

public class uklsulitno1 {
    public static void main(String[] args) {
            //Scanner input
        Scanner input = new Scanner(System.in);

        //menginput jumlah siswa
       System.out.println("Masukkan jumlah siswa");
       int jumlahsiswa = input.nextInt();

       //array nilai dari jumlah siswa
       double [] nilai = new double[jumlahsiswa];
       double totalnilai = 0;

       //pengulangan input 
       for (int i = 0; i <nilai.length; i++) {
        System.out.println("Masukkan nilai siswa ke "+(i+1));
        //input nilai siswa
        nilai[i] = input.nextDouble();
        //totalnilai sama dengan nilai input
        totalnilai += nilai[i];
       }   
       //perhitungan rata-rata nilai siswa dari total nilai dibagi jumlah siswa
       double ratarata = totalnilai / jumlahsiswa;
       //tampilan
       System.out.println("total nilai siswa adalah "+totalnilai);
       System.out.println("Jumlah siswa adalah "+jumlahsiswa);
       System.out.println("Rata-rata nilai siswa adalah "+ratarata);
    }
}
