package Lession03;

public class Lab_3_4 {

    public static void main(String[] args) {
        int[] arrayA = new int[]{10, 12, 8, 9, 100};
        int[] arrayB = new int[]{1, 2, 3, 99, 101};
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 10; k++){
                if (arrayA[j] > arrayA[k]) {
                    int temp = 0;
                    temp = arrayA[j];
                    arrayA[j] = arrayA[k];
                    arrayA[k] = temp;
                }
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayA[i] + " ");
        }
    }
}
