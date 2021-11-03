import java.util.Scanner;

public class exam2 {

    public static void main(String[] args) {
        int[] myArrays = new int[10];

        System.out.println("Massivin elementlerini girin: ");

        for(int i = 0; i < myArrays.length; i++){
           System.out.println((i+1) + "-ci element: ");
           myArrays[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Cut elementler gosterilir: ");

        for(int i = 0; i < myArrays.length; i++){

            if(myArrays[i] % 2 == 0)
            System.out.println("Cut elementler: " + myArrays[i]);
         }
    }
}
