package shared_resource;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem() {
        isItemPresent = true;
        System.out.println("Produced thread calling notify method");
        notifyAll(); // notify all to continue who are waiting on this object
    }

    public synchronized void consumeItem() {
        System.out.println("Consumer thread inside consumeItem method");
        while (!isItemPresent) {
            try {
                System.out.println("Consumer thread is waiting");
                wait(); // release all the monitor lock
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Consumer thread consumed the item");
        isItemPresent = false;
    }
}
