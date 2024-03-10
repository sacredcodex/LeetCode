package Solved;

public class Solution622 {
    class MyCircularQueue {

        int[] nums;
        int capacity;
        int start;
        int length;

        public MyCircularQueue(int k) {
            capacity = k;
            nums = new int[k];
            start = 0;
            length = 0;
        }

        public boolean enQueue(int value) {
            if (length == capacity) return false;
            nums[(start + length) % capacity] = value;
            length += 1;
            return true;
        }

        public boolean deQueue() {
            if (length == 0) return false;
            start += 1;
            if (start == capacity)
                start = 0;
            length -= 1;
            return true;
        }

        public int Front() {
            if (length == 0) return -1;
            return nums[start];
        }

        public int Rear() {
            if (length == 0) return -1;
            return nums[(start + length - 1) % capacity];
        }

        public boolean isEmpty() {
            return length == 0;
        }

        public boolean isFull() {
            return length == capacity;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
