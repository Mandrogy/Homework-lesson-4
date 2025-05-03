public class Main {
    public static void main(String[] args) {
//        1. Вывести макс и мин
//        2. Вывести чет и не чет числа
//        3. Вывести самое длинное и короткое число
//        Со * 4. Выводить только те числа которые идут в порядке возрастания
//        Со * 5. Вывести все числа палиндромы в массиве
//===========================================================================================
        //Задача 1 Вывести макс и мин
        int[] arr = {45, 78, -15, 12, 34, 6, 90, 7, -2, -45};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; //минимальное значение
            }
            if (arr[i] > max) {
                max = arr[i]; //максимальное значение
            }
        }
        System.out.println("Задача № 1");
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

//===========================================================================================
        //Задача 2 Вывести чет и не чет числа
        System.out.println("\nЗадача № 2");
        System.out.print("Чётные числа: ");
        for (int num : arr) { // цикл for-each
            if (num % 2 == 0) {  // Проверка на чётность
                System.out.print(num + " ");
            }
        }
        System.out.print("\nНечётные числа: ");
        for (int num : arr) { // цикл for-each
            if (num % 2 != 0) {  // Проверка на нечётность
                System.out.print(num + " ");
            }
        }
//===========================================================================================
//Задача 3 Вывести самое длинное и короткое число
        System.out.println("\n\nЗадача № 3");


//===========================================================================================
//Задача 4 Выводить только те числа которые идут в порядке возрастания
        System.out.println("\nЗадача № 4");
        System.out.println("Первый вариант решения, если нужно найти возрастание из всего массива:");
        int one = arr[0];
        System.out.print(one + " ");

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (num > one) {
                System.out.print(num + " ");
                one = num;
            }
        }
        System.out.println("\n\nВторой вариант решения, если надо все возрастания найти:");
        int ones = arr[0];
        System.out.print(ones);

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (num > ones) {
                System.out.print(" " + num);
            } else {
                System.out.println();
                System.out.print(num);
            }
            ones = num;
        }
    }
}
