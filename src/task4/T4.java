package task4;

import java.util.Arrays;

public class T4 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 2, 9};
        int target = findTargetValue(numbers);
        int steps = calculateSteps(numbers, target);

        System.out.println("Количество шагов: " + steps);
    }

    private static int findTargetValue(int[] numbers) {
        Arrays.sort(numbers);

        if (numbers.length % 2 == 1) {
            return numbers[(numbers.length - 1) / 2];
        } else {
            int middleIndex = numbers.length / 2;
            return (numbers[middleIndex] + numbers[middleIndex - 1]) / 2;
        }
    }

    private static int calculateSteps(int[] numbers, int target) {
        int totalSteps = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalSteps += Math.abs(numbers[i] - target);
        }

        return totalSteps;
    }
}
