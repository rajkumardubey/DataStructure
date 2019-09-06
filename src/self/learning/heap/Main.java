package self.learning.heap;

import self.learning.heap.min.MinHeap;

public class Main {
    public static void main(String[] arg) {
        final MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.printArray();
        System.out.println("The Min val is " + minHeap.getMin());
        System.out.println("Delete Min val is " + minHeap.extractMin());
        System.out.println("The Min val is " + minHeap.getMin());
    }
}
