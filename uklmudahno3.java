package soalukl;

public class uklmudahno3 {

        public static void main(String[] args) {
            //pengulangan int
            for (int a = 50; a >= 1; a--) {
                //untuk bilangan yang kelipatan 3
                if (a % 4 == 0) {
                    //tampilan
                    System.out.println(a + ". saya anak angkatan 33");
                    //untuk bilangan kelipatan 2
                } else if (a % 4 == 1) {
                    //tampilan
                    System.out.println(a + ". saya anak moklet");
                    //selain bilangan kelipatan 3 dan 2
                } else if (a % 4 == 2) {
                    //tampilan
                    System.out.println(a + ". saya anak wikusama");
                } else if (a % 4 == 3) {
                    System.out.println(a +". saya senang");
                } 
            }
            //tampilan no.1
            
        }
    }
