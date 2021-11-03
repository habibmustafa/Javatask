public class exam1 {

    public static void main(String[] args) {
        int[] myArrays = { 92, 34, 56, 3, 100, 256, 43 };

        int maxNum = myArrays[0];

        for (int i = 1; i < myArrays.length; i++) {
            if (myArrays[i] > maxNum) {
                maxNum = myArrays[i];
            }
        }

        System.out.println("Maksimum eded: " + maxNum);

    }
}
