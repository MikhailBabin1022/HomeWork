package HomeWork3;

public class User1 {
    public class User1 {
        public enum USER {
            USER1 ("David", "Berkovich", 25, "M"),
            USER2 ("Elena", "Ivanova", 35, "W"),
            USER3 ("Ivan", "Ivanov", 38, "M"),
            USER4 ("Irina", "Petrova", 19, "W");

            private String name;
            private String surname;
            private int age;
            private String gender;

            USER(String name, String surname, int age, String gender) {
                this.name = name;
                this.surname = surname;
                this.age = age;
                this.gender = gender;
            }
            public void println(){
                System.out.println(name +" "+ surname);
            }
            public void addAge(int addAge){
                age += addAge;
                System.out.println(age);
            }
            public void printUser() {
                System.out.println("имя: " +name +", фамилия: "+ surname +", возраст: "+ age +",  пол: "+ gender);
            }

        }
    }

}
