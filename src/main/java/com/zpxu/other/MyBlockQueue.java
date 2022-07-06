package com.zpxu.other;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class MyBlockQueue {
    private int[] nums;
    private int head;
    private int tail;
    private int size;
    private Object lock = new Object();

    public MyBlockQueue(int length) {
        nums = new int[length];
    }

    public void offer(int value) throws Exception {
        synchronized (lock) {
            while (size == nums.length) {
                lock.wait();
            }
            nums[tail++] = value;
            if (tail >= nums.length) {
                tail = 0;
            }
            size++;
            lock.notify();
        }
    }

    public int poll() throws Exception {
        synchronized (lock) {
            while (size == 0) {
                lock.wait();
            }
            int result = nums[head++];
            if (head >= nums.length) {
                head = 0;
            }
            size--;
            lock.notify();
            return result;
        }
    }
}
