package com.zpxu.other.sort;

/**
 * @author: zpxu
 * @date: 2023/12/13
 * @description:
 */
public class BubbleSort {
    public void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 如果在一次冒泡过程中没有发生数据交换，则说明不整个排序数组是有序的了
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
