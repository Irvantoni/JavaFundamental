import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        //if-else
        Scanner baca = new Scanner(System.in);
        String namaInput = baca.nextLine();
        String peranInput = baca.nextLine();
        baca.close();
        
        if (namaInput.isEmpty() && peranInput.isEmpty()) {
            System.out.println("Nama dan Peran Harus Di Isi");
        } 
        else if (peranInput.isEmpty()) {
            System.out.println("Peran Harus Di Isi");
        } 
        else if (peranInput.equalsIgnoreCase("superhero")) {
            System.out.println("Selamat Datang Superhero " + namaInput + ", Kalahkan Semua Monster Di Muka Bumi");
        } 
        else if (peranInput.equalsIgnoreCase("monster")) {
            System.out.println("Selamat Datang Monster " + namaInput + ", Hancurkan Semua Superhero Yang Ada");
        }
        else {
            System.out.println("Selamat Datang " + namaInput + ", Pilih Peranmu Untuk Melanjutkan Game Ini");
        }
    }
}
