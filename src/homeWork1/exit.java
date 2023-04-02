package homeWork1;

public class exit {
    public class Exit {
        public void consolInput() {
            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.println("Введите слово: ");
                String inputWord = scanner.nextLine();
                if (inputWord.equals("exit")) {
                    System.out.println("Программа завершена");
                    break;
                }else{
                    System.out.println("Вы ввели: " + inputWord);

                }
            }
            scanner.close();
        }
    }

}
