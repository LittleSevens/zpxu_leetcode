package com.zpxu.other.sort;

/**
 * @author: zpxu
 * @date: 2023/12/13
 * @description:
 */
public class SelectionSort {
    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
