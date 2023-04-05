package homeWork2;

public class elements {
    public class Main {
        public static void main(String[] args) {

            int[] arr = {10, 5, 20, 8, 15}; // произвольный массив

            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            int sum = min + max;
            System.out.println("Сумма минимального и максимального элементов: " + sum);

        }
    }
}
