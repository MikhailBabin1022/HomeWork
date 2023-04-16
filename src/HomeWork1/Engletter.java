package HomeWork1;

public class Engletter {
    public class letterEngl1 {
        public static <Scanner> void test() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите букву:");
            String letter = scanner.clone().toLowerCase();
            if (letter.equals("a")
                    || letter.equals("e")
                    || letter.equals("i")
                    || letter.equals("o")
                    || letter.equals("u")) {

                System.out.println("Гласная буква");
            }else{
                System.out.println("Согласная буква");
            }

        }
    }
}
