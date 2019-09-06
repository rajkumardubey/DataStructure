package self.learning.priorityqueue.exception;

/**
 * Exception to indicate that Queue is empty.
 */
public class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}