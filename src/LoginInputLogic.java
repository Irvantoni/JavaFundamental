import java.util.Scanner;

public class LoginInputLogic {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String inputUsername = baca.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPassword = baca.nextLine();

        baca.close();
        
        Boolean cekUsername = inputUsername.equalsIgnoreCase("ilham");
        Boolean cekPassword = inputPassword.equals("ilham");

        Boolean isLoginSuccess = cekUsername && cekPassword;
        if (isLoginSuccess == true) {
            System.out.println("Selamat datang, silahkan masuk ...");
        } else {
            System.out.println("Username atau Password Salah!");
        }
    }
}