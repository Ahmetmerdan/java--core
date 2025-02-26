package john;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultiThreadthing myThing=new MultiThreadthing(i);
            myThing.start();
        }
        
       
    }
}
