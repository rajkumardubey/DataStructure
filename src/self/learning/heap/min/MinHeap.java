package self.learning.heap.min;

import java.util.stream.IntStream;

public class MinHeap {
    private static final String HEAP_PRINT = "\nPARENT : %s, \nLEFT CHILD : %s, \nRIGHT CHILD : %s";
    private static final int FRONT = 1;

    private final int MAX_SIZE;
    private final int[] heap;
    private int size;

    public MinHeap(final int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.size = 0;
        heap = new int[this.MAX_SIZE + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    /**
     * To insert a node into the heap
     */
    public void insert(int element) {
        if (size >= MAX_SIZE) return;

        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    /**
     * To print the contents of the heap
     */
    public void print() {
        IntStream.rangeClosed(1, size / 2)
                .forEach(i -> System.out.print(String.format(HEAP_PRINT, heap[i], heap[2 * i], heap[2 * i + 1])));
    }

    /**
     * To print the contents of the heap
     */
    public void printArray() {
        System.out.print("The Min Heap is ");
        IntStream.range(1, size)
                .forEach(i -> System.out.print(heap[i] + " "));
        System.out.println();
    }

    /**
     * To return the minimum element from the heap
     */
    public int getMin() {
        return heap[FRONT];
    }

    /**
     * To remove and return the minimum element from the heap
     */
    public int extractMin() {
        final int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    /**
     * Function to build the min heap using the minHeapify
     */
    public void minHeap() {
        int position = size / 2;
        while (position >= 1) minHeapify(position--);
    }

    /* Function to return the position of the parent for the node currently at pos */
    private int parent(int pos) {
        return pos / 2;
    }

    /* Function to return the position of the left child for the node currently at position */
    private int leftChild(final int position) {
        return (2 * position);
    }

    /* Function to return the position of the right child for the node currently at position */
    private int rightChild(final int position) {
        return (2 * position) + 1;
    }

    /* Function that returns true if the passed node is a leaf node */
    private boolean isLeaf(final int position) {
        return position >= (size / 2) && position <= size;
    }

    /* Function to swap two nodes of the heap */
    private void swap(final int firstPosition, final int secondPosition) {
        int tmp;
        tmp = heap[firstPosition];
        heap[firstPosition] = heap[secondPosition];
        heap[secondPosition] = tmp;
    }

    /* Function to heapify the node at position */
    private void minHeapify(final int position) {
        /* If the node is a non-leaf node and greater than any of its child */
        if (!isLeaf(position)) {
            if (heap[position] > heap[leftChild(position)]
                    || heap[position] > heap[rightChild(position)]) {

                if (heap[leftChild(position)] < heap[rightChild(position)]) {
                    /* Swap with the left child and heapify the left child */
                    swap(position, leftChild(position));
                    minHeapify(leftChild(position));
                } else {
                    /* Swap with the right child and heapify the right child */
                    swap(position, rightChild(position));
                    minHeapify(rightChild(position));
                }
            }
        }
    }
}
