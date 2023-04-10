package homeWork3;

public class SeasonEnum {
    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL
    }

    public class SeasonEnum {
        public static void test10(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название месяца: ");
            String monthName = scanner.next().toUpperCase();

            Season season;
            switch (monthName) {
                case "JANUARY":
                case "FEBRUARY":
                case "DECEMBER":
                    season = Season.WINTER;
                    break;
                case "MARCH":
                case "APRIL":
                case "MAY":
                    season = Season.SPRING;
                    break;
                case "JUNE":
                case "JULY":
                case "AUGUST":
                    season = Season.SUMMER;
                    break;
                case "SEPTEMBER":
                case "OCTOBER":
                case "NOVEMBER":
                    season = Season.FALL;
                    break;
                default:
                    System.out.println("Ошибка: некорректное название месяца");
                    return;
            }

            System.out.println("Месяц " + monthName + " относится к поре года: " + season);
        }
    }
}
