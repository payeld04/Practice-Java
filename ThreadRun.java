class Mythread implements Runnable {
    private String tname;
    
    public Mythread(String tname){
        this.tname=tname;
    }
    
    public void run(){
         System.out.println(tname+" started execution......");
         try{
             Thread.sleep(500);
         }
        catch(Exception e){
            System.out.println(e.getMessage()+" error occured");
        }
        System.out.println(tname+" completed execution......");
    }
}
public class ThreadRun{
    public static void main(String args[]) {
        Runnable r1=new Mythread("Inbox thread");
        Runnable r2=new Mythread("sent thread");
        
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        
        t1.start();
        t2.start();
        
        try{
             t1.join();
             t2.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"error occured");
        }
        System.out.println("All threads have been completed.....");
    }
}
