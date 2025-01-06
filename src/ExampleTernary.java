public class ExampleTernary {
   public static void main(String[] args) {
    int isEven = 11;
    String result = "Cetak Angka ";
    result += isEven % 2 == 0 ? "Genap" : "Ganjil";
    System.out.println(result);
   }
}
