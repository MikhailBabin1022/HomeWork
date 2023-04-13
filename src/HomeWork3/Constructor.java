package HomeWork3;

public class Constructor {
    public class MyClass {
        private int num;


        public MyClass(int num) {
            this.num = num;
        }

        // Конструктор без параметров
        public MyClass() {
            this(0);
        }

        // Конструктор с двумя параметрами
        public MyClass(int num1, int num2) {
            this(num1 + num2);
        }

        public int getNum() {
            return num;
        }

        public static void main(String[] args) {

            MyClass obj = new MyClass();
            System.out.println(obj.getNum()); // Выведет "0"
        }
    }
}
