import java.util.Scanner;

public class exam3 {

    public static void main(String[] args) {
        int[] myArrays1 = new int[5];
        int[] myArrays2 = new int[4];
        int[] myArrays3 = new int[myArrays1.length+myArrays2.length];
        System.out.println("1-ci massivin elementlerini girin: ");

        for (int i = 0; i < myArrays1.length; i++) {
            System.out.println((i + 1) + "-ci element: ");
            myArrays1[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("2-ci massivin elementlerini girin: ");

        for (int i = 0; i < myArrays2.length; i++) {
            System.out.println((i + 1) + "-ci element: ");
            myArrays2[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("3-cu massivin elementleri: ");

        for (int i = 0; i < (myArrays1.length+myArrays2.length); i++) {
            if(i < myArrays1.length){
                myArrays3[i] = myArrays1[i];
                System.out.println(myArrays3[i]);
            }
            else if(i >= myArrays1.length) {
                myArrays3[i] = myArrays2[i-myArrays1.length];
                System.out.println(myArrays3[i]);
            }

        }

    }

}
