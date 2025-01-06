import java.util.*;

public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Integer input;
        input = baca.nextInt();
        baca.close();

        // char nilai = 'A';

        // switch(nilai) {
        // case 'A' :
        // System.out.println("Sangat Baik");
        // break;
        // case 'B' :
        // System.out.println("Baik");
        // break;
        // case 'C' :
        // System.out.println("Cukup");
        // break;

        // default :
        // System.out.println("Nilai tidak terdaftar");
        // }

        // int penghasilanPetani = 7500;
        // String kategori = switch(penghasilanPetani) {
        // case 5000 -> "Rendah";
        // case 7500 -> "Menengah";
        // case 10000 -> "Tinggi";

        // default -> "Tidak Terdefinisi";
        // };
        // System.out.println("Kategori pendapatan petani: " + kategori);
        // }

        // int input = 12;
        // String kategori = switch (input) {
        //     case 1, 2, 3 -> "Q1: Rentang Januari hingga Maret";
        //     case 4, 5, 6 -> "Q2: Rentang April hingga Juni";
        //     case 7, 8, 9 -> "Q3: Rentang Juli hingga September";
        //     case 10, 11, 12 -> "Q4: Rentang Oktober hingga Desember";

        //     default -> "Tidak Terdefinisi";
        // };
        // System.out.println(kategori);


        String kategori = switch(input) {
            case 0 -> "Tidak ada pendapatan :( ";
            default -> {
                if (input <= 5000) yield "Rendah";
                else  if (input <= 10000) yield "Menengah";
                else yield "Tinggi";
            }
        };
        System.out.println(kategori);
    }
}
