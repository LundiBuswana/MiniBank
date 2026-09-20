public class BankWorker implements Runnable{

    @Override
    public void run() {
        for(int x=1; x<=10; x++){
            System.out.println("Worker iteration "+x+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException ex){
                System.out.println("Interrupted "+Thread.currentThread().getName());
                break;
            }
        }
    }
}
