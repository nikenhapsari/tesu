public class Hello { // kalo pake public nama class harus sama kaya nama file,
                     // tapi kalo cuma class doang gaada publicnya bisa beda
    
    public static void main(String args[]){
        
        int angkaBilanganBulatDibawah10=1; //biasanya dimulai pake huruf kecil,
                                           //terus camel case jadi setiap kata awal abis kata pertama hurufnya gede
        
        //bilangan bulat
        byte a = 1;     //batesnya dari -128,0,127
        short b = 2;    //batesnya -32768,0,32767
        int c = 800000;      
        long d = 4L;     //tipe integer yg paling panjang, direkomendasikan belakangnya pake 'L'

        //bilangan desimal
        float e =  1.0f;
        double f = 1.0;

        a = (byte) c;
        System.out.println("Nilai a = " + a);
        c = a;
        System.out.println("Nilai c = " + c);
        
        /*
        c=a (bisa)
        a=c (ga bisa) soalnya ukuran memori byte lebih kecil dari int,
                      kalo mau di casting, jadinya  a=(byte)c jadi
                      c di ubah ke byte dulu baru dimasukin ke a
            kalo dari int ke byte down casting
            dari byte ke int up casting

        */
        
        char g = 'N' ; //char itu cuma buat 1 huruf
        int i = (int) g;
        System.out.println("char N dalam byte " +i); //yang ditampilin hasil dari bil ASCII
        
        System.out.println("Niken Hapsari");
    }
}
