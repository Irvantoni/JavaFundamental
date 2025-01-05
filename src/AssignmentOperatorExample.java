public class AssignmentOperatorExample {
    public static void main(String[] args) {

        // =  +=  -=  *=  /=  %=
        
        short num1 = 5;
        short num2 = 10;
        
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");

        System.out.println("num1 = num2 >> " + (num1 = num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        System.out.println("num1 += num2 >> " + (num1 += num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        System.out.println("num1 -= num2 >> " + (num1 -= num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        System.out.println("num1 *= num2 >> " + (num1 *= num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        System.out.println("num1 /= num2 >> " + (num1 /= num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        System.out.println("num1 %= num2 >> " + (num1 %= num2));
        System.out.println("Sekarang nilai num1 = " + num1 + " nilai num2 = " + num2);
        System.out.println("");
        
    }
}
