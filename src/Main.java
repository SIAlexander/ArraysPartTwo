public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println("Задача 1");
        int arr[] = generateRandomArray();
        int amountOfExpensesPerMonth = 0;

        for (int i = 0; i < arr.length; i++) {
            amountOfExpensesPerMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfExpensesPerMonth + " рублей");
    }

    public static void task2(){
        System.out.println("Задача 2");
        int arr[] = generateRandomArray();
        int maxAmountOfExpensesDay = arr[0];
        int minAmountOfExpensesDay = arr[0];

        for (int j : arr) {
            if (j > maxAmountOfExpensesDay) {
                maxAmountOfExpensesDay = j;
            }
            if (j < minAmountOfExpensesDay) {
                minAmountOfExpensesDay = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmountOfExpensesDay + " рублей. Максимальная сумма трат за день составила " + maxAmountOfExpensesDay + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int arr[] = generateRandomArray();
        int amountOfExpensesPerMonth = 0;
        double averageCostAmount = 0;

        for (int j : arr) {
            amountOfExpensesPerMonth += j;
        }
        averageCostAmount = amountOfExpensesPerMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCostAmount + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}