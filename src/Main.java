import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
     int[] arr = new int [30];
     int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 100_000) + 100_000);

            sum += arr[i];
        }
        System.out.print("Сумма трат за месц составила " + sum + " рублей." );
        System.out.println();

        // Задание 2
        int max = 0;
        int min = 200_000;
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);

        // Задание 3
       float averageAmount = sum/30f;
        System.out.println("Средняя сумма трат за месяц состаила " + averageAmount + " рублей.");

        // Задание 4
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
    }

