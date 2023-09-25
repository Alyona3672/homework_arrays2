import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt( 100_000) + 100_000;
            }
            return arr;
        }


        public static void task1() {
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(" Сумма трат за месяц составила " + sum + " рублей.");
        }

        public static void task2() {
            int[] arr = generateRandomArray();
            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println(" Минимальная сумма трат за день составила " + min + "  рублей. ");
            System.out.println(" Максимальная сумма трат за день составила " + max + " рублей. ");
        }

        public static void  task3() {
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            }
            float average = (float) sum / arr.length;
            System.out.println(" Средняя сумма трат за месяц составила " + average + " рубей. ");
        }

        public static void task4() {
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            reverseAndPrintNme(reverseFullName);
        }
        public static void reverseAndPrintNme(char[] name) {
            for (int i = name.length - 1; i >= 0; i--) {
                System.out.print(name[i]);
            }
        }
    }