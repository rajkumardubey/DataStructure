package self.learning.priorityqueue.custom;

import self.learning.priorityqueue.exception.QueueEmptyException;
import self.learning.priorityqueue.exception.QueueFullException;

public class MyCustomPriorityQueue {

    private int[] priorityQueueArray;
    private int size; //Size of Queue
    private int number;  //holds number of elements in Priority Queue, initialized with 0 by default

    public MyCustomPriorityQueue(final int size) {
        this.size = size;
        priorityQueueArray = new int[this.size];
        number = 0;
    }

    /**
     * Insert element in Priority Queue, element will be inserted on basis of priority.
     */
    public void insert(int value) throws QueueFullException {
        if (isFull()) throw new QueueFullException("Cannot insert " + value + ", Queue is full");

        /* If no values in PriorityQueue- insert at starting position, i.e. at 0th position. */
        if (number == 0) priorityQueueArray[number++] = value;
        else {
            int counter;
            for (counter = number - 1; counter >= 0; counter--) {
                /* if value is larger, shift elements upward till value is larger. */
                if (value > priorityQueueArray[counter]) priorityQueueArray[counter + 1] = priorityQueueArray[counter];
                else break;
            }

            /* insert element in space created by upward shift of elements. */
            priorityQueueArray[++counter] = value;
            number++;
        }
    }

    /**
     * Remove elements from Priority Queue
     */
    public int get() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("Queue is empty");
        return priorityQueueArray[number - 1];
    }

    /**
     * Remove elements from Priority Queue
     */
    public int remove() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("Queue is empty");
        return priorityQueueArray[--number];
    }

    /* Returns true if Priority Queue is full */
    private boolean isFull() {
        return number == size;
    }

    /* Returns true if Priority Queue is empty */
    private boolean isEmpty() {
        return number == 0;
    }
}