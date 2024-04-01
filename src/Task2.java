import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];


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


//        Arrays.sort(array);
//        System.out.println(array[0]);
//        System.out.println(array[array.length-1]);

        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("min " + minValue);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max " + maxValue);

    }
}
