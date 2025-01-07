public class ExampleJavaArray {
    public static void main(String[] args) {
        int[] angka;
        angka = new int[3];

        // angka[0] = 1;
        // angka[1] = 2;
        // angka[2] = 3;

        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka.length);
        /*---------------------------------------------------*/
        
        String[] seminggu = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        // for (int i = 0; i < seminggu.length; i++) {
        //     System.out.println(seminggu[i]);
        // }

        for (String hari : seminggu) {
            System.err.println(hari);
        }
        /*---------------------------------------------------*/

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        //cetak dengan for
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        // cetak dengan for each
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
