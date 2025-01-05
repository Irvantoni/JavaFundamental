public class ExampleVariable {

    static String nama = "Irvantoni Ilham";

    public static void main(String[] args) {
        String status = "Trainee";
        String perusahaan = "Enigma Camp";
        Byte batch = 6;
        String kota = "Malang";

        System.out.println(nama + " adalah " + status + " " + perusahaan + " " + batch + " " + kota);
        
        //Primitive data types in java (boolean, byte, short, int, long, float, double, and char)
        boolean isTrainee = false;           //true or false
        byte bait = 127;                     //-128 to 127
        short pendek = 32767;                //-32,768 to 32,767
        int age = 22;                        //-2,147,483,648 to 2,147,483,647
        long panjang = 371000000000000L;     //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float number = 3.14F;                //6 to 7 decimal digits
        double presisi = 5.123456789;        //15 to 16 decimal digits
        char ascii = 64;                     //single character/letter or ASCII values

        System.out.println(isTrainee);
        System.out.println(bait);
        System.out.println(pendek);
        System.out.println(age);
        System.out.println(panjang);        
        System.out.println(number);    
        System.out.println(presisi);
        System.out.println(ascii);
        
        // Non-primitive data types in java {classes, interfaces, arrays}
        Boolean a = true;
        Byte b = 5;
        Short c = 24;
        Integer d = 20;
        Long e = 27L;
        Float f = 10.63F;
        Double g = 12.2436;
        
        System.out.println("~~~~~");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
