public class exam4 {

    public static void main(String[] args) {
        int[] myArrays = new int[10];

        System.out.println("Massivin elementleri: ");

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println((i + 1) + "-ci element: ");
            myArrays[i] = (int) (Math.random() * 101);
            System.out.println(myArrays[i]);
        }
        System.out.println("cutler: ");
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] % 2 == 0) {
                System.out.println(myArrays[i]);
            }
        }

        System.out.println("tekler: ");
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] % 2 == 1) {
                System.out.println(myArrays[i]);
            }
        }
    }
}