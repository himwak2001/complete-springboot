package semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Locked acquire by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            lock.release();
            System.out.println("Lock released by: " + Thread.currentThread().getName());
        }
    }
}
