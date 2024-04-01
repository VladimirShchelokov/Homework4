import java.util.Scanner;

public class Task4 {
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

        int number = 0;


        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                number++;
            }
        }
        System.out.print("Количество нулевых элементов " + number);

    }
}
