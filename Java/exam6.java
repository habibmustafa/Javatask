import java.util.Scanner;

public class exam6 {

    public static void main(String[] args) {

        int[] myArrays = new int[5];

        System.out.println("Massivin elementlerini girin: ");

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println((i + 1) + "-ci element: ");
            myArrays[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Massive elave olunacaq ededi daxil edin: ");

        int eded = new Scanner(System.in).nextInt();

        int[] endArrays = new int[myArrays.length + 1];

        endArrays[myArrays.length] = eded;

        System.out.println("Massiv: ");

        for(int i = 0; i<endArrays.length; i++) {
            System.out.println(endArrays[i]);
        }
    }
    
}
