package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int variable = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = variable;

            int variable1 = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = variable1;
        }
        return array;
    }
}
