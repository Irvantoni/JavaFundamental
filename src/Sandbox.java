import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int waktuKumpul = baca.nextInt();
        baca.close();

        if (waktuKumpul >= 8 && waktuKumpul <= 17) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failed");
        }
    }
}