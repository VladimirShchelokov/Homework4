import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива -> ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];


//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Введите элемен массива -> ");
//            array[i] = scanner.nextInt();         //заполнение массива вручную
//        }

        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 100); //Заполнение массива случайными числами
        }

        System.out.print("Массив -> ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for(int item : array){
            System.out.print(item + " ");
        }
    }
}
