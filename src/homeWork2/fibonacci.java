package homeWork2;

public class fibonacci {
    public class Fibonachi{
        public static void Fib(){
            int[] Mas=new int[20];
            //С помощью простого цикла заполним значения элементов массива
            for(int i=0;i<Mas.length;i++){
                //Если индекс элемента массива меньше 2 присваиваем ему значение
                if(i<2){
                    Mas[i]=1;
                }
                //Во всех остальных случаях значение элемента массива равно сумме значений двух предыдущих елементов массива
                else {
                    Mas[i]=Mas[i-2]+Mas[i-1];

                }
                System.out.print(Mas[i]+" ");
            }
        }
    }
}
