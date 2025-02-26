package john;

public class MultiThreadthing extends Thread {
    private int threadNumber;

    public MultiThreadthing(int threadNumber){
        this.threadNumber=threadNumber;
    }
 @Override
 public void run(){
    for (int i = 1; i <=5; i++) {
    
        System.out.println(i+ "from thread:"+threadNumber);
      
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }
 }
}
