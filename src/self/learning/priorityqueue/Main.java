package self.learning.priorityqueue;

import self.learning.priorityqueue.custom.MyCustomPriorityQueue;

public class Main {
    public static void main(String[] args) {
        final MyCustomPriorityQueue priorityQueue = new MyCustomPriorityQueue(10);

        try {
            priorityQueue.insert(81);
            priorityQueue.insert(72);
            priorityQueue.insert(52);
            priorityQueue.insert(61);

            System.out.print("Getting element with highest priority: ");
            System.out.print(priorityQueue.get() + " ");

            System.out.print("\nDeleted elements from queue: ");
            System.out.print(priorityQueue.remove() + " ");
            System.out.print(priorityQueue.remove() + " ");

            priorityQueue.insert(62);
            priorityQueue.insert(73);

            System.out.print(priorityQueue.remove() + " ");
            System.out.print(priorityQueue.remove() + " ");
            System.out.print(priorityQueue.remove() + " ");
            System.out.print(priorityQueue.remove() + " ");


            System.out.print("\nWhen deleted from empty queue: ");
            System.out.print(priorityQueue.remove() + " ");

        } catch (final Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }

    }
}
