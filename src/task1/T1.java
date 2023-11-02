package task1;

import java.util.Scanner;

import java.util.Arrays;
public class T1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        System.out.print("Введите длину интервала: ");
        int m = sc.nextInt();

        int[] arr = new int[n];
        Arrays.setAll(arr, i -> ++i);

        int current = 1;
        System.out.print("Путь: ");
        do {
            System.out.print(current);
            current = (current + m - 2) % n + 1; // сдвиг на 1
        } while (current != 1);
    }
}
