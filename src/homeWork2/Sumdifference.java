package homeWork2;

import java.util.Scanner;

public class Sumdifference {
    public class Sumdifference{
        public void Sumdifference(){
            System.out.println("Нахождение разницы между суммой элементов, стоящих на четных и нечетных\n" +
                    "местах.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество элементов массива : ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент " + (i+1) + ": ");
                arr[i] = scanner.nextInt();
                if (i % 2 == 0) {
                    evenSum += arr[i];
                } else {
                    oddSum += arr[i];
                }
            }
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("Сумма элементов на четных позициях : " + evenSum);
            System.out.println("Сумма элементов на нечетных позициях : " + oddSum);
            System.out.println("Разница между суммами элементов : " + diff);
        }
    }
}
