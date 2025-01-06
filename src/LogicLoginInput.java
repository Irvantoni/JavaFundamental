import java.util.Scanner;

public class LogicLoginInput {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String inputUsername = baca.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPassword = baca.nextLine();

        baca.close();
        
        //with input, conditional if dan else if
        Boolean cekUsername = inputUsername.equalsIgnoreCase("ilham");
        Boolean cekPassword = inputPassword.equals("ilham");

        Boolean isLoginSuccess = cekUsername && cekPassword;

        if (isLoginSuccess == true) {
            System.out.println("Selamat datang, silahkan masuk ...");
        } 

        else if (cekUsername == false) {
            System.out.println("Username Salah!");
        } 

        else if (cekPassword == false) {
            System.out.println("Password Salah!");
        } 
        
        else  {
            System.out.println("Username atau Password Salah!");
        }
    }
}
