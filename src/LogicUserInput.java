import java.util.Scanner;

public class LogicUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Siapa namamu? : ");
        System.out.print("Halo " + input.nextLine());
        input.close();
    }
}
