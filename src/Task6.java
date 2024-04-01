import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.print("Введите размер массива -> ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];


        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемен массива -> ");
            array[i] = scanner.nextInt();         //заполнение массива вручную
        }

//        for (int i = 0; i < num; i++) {
//            array[i] = (int) (Math.random() * 100); //Заполнение массива случайными числами
//        }

        System.out.print("Массив -> ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}