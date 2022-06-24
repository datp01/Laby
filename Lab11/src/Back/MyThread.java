package Back;

public class MyThread extends Thread {
    int exiting;
    String poisition;

    MyThread(int exiting,String poisition) {
        this.exiting = exiting;
        this.poisition=poisition;
    }
    public  void run() {
        for (int i = 0;i<exiting;i++) {
            System.out.println(poisition + ": " + (exiting-i));
            try {
                Thread.sleep(Math.round(Math.random()*1500));
            } catch (Exception e ){}
        }
        System.out.println(exiting + " exiting");
    }
}
