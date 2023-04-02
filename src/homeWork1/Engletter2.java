package homeWork1;

public class Engletter2 {
    public class letterEngl2 {
        public static <Scanner> void test2() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите букву");
            String letter = scanner.clone().toLowerCase();
            switch(letter){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Гласная буква");
                    break;
                default:
                    System.out.println("Согласная буква");
                    break;

            }
        }
    }
}
