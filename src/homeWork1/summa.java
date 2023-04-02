package homeWork1;

public class summa {
    public static void test4() {
    }

    public class Sum {
        public static void test4() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            int sum = 0;
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                if(i % 3 == 0){
                    sum +=i;
                }
            }
            System.out.println("Сумма всех чисел, которые делятся на 3 и расположены между"
                    + firstNumber + " и " + secondNumber + ":"+sum);
        }
    }

}
