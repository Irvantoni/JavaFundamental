import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        scan.close();

        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }
    }
}