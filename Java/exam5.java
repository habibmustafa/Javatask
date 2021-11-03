import java.util.Scanner;

public class exam5 {

    public static void main(String[] args) {

        int[] myArrays = new int[5];

        System.out.println("Massivin elementlerini girin: ");

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println((i + 1) + "-ci element: ");
            myArrays[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Eded daxil edin: ");

        int eded = new Scanner(System.in).nextInt();

        System.out.println("Massiv: ");

        for (int i = 0; i < myArrays.length; i++) {
            if (eded == myArrays[i]) {
                continue;
            }
            System.out.println(myArrays[i]);
        }
        
    }
}