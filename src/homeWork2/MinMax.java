package homeWork2;

public class MinMax {
    public class MinMax {
        public void MinMax() {
            System.out.println("Нахождение суммы минимального и максимального элементов в произвольном массиве");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент " + (i+1) + ": ");
                arr[i] = scanner.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } else if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int sum = min + max;
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Сумма минимального и максимального элементов: " + sum);
        }
    }
}
