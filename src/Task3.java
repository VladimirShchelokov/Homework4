import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {

        System.out.print("Введите размер массива -> ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];

        System.out.print("Массив -> ");

//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();         //заполнение массива вручную
//        }


        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 100); //Заполнение массива случайными числами
        }


        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();


        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент массива " + minValue);

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            number++;
            if (minValue == array[i]) {
                break;
            }
        }

        System.out.println("Индекс минимального значения " + (number - 1));

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальный элемент массива " + maxValue);

        int number1 = 0;
        for (int i = 0; i < array.length; i++) {
            number1++;

            if (maxValue == array[i]) {
                break;
            }
        }
        System.out.println("Индекс максимального значения " + (number1 - 1));
    }
}
