package shared_resource;

public class JoinSharedResource {
    public synchronized void produce() {
        System.out.println("Lock acquired...");
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Lock released ...");
    }
}
