package Back;

public class myJavaThread {
    public static void main(String[] args) {
        MyThread[] myThreads= new MyThread[3];
        myThreads[0] = new MyThread(5,"First");
        myThreads[1] = new MyThread(5,"Second");
        myThreads[2] = new MyThread(5,"third");
        for ( int i=0;i<3; i ++)
            myThreads[i].start();
    }
}
