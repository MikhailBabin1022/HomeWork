package HomeWork3.Seasons;

public class CheckSeasons {
    public class Season {
        public void checkSeason(Month month) {
            switch (month) {
                case DECEMBER:
                case JANUARY:
                case FEBRUARY:
                    System.out.println("It is winter");
                    break;
                case MARCH:
                case APRIL:
                case MAY:
                    System.out.println("It is spring");
                    break;
                case JUNE:
                case JULY:
                case AUGUST:
                    System.out.println("It's summer");
                    break;
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                    System.out.println("This autumn");
                    break;

            }
        }

    }
}