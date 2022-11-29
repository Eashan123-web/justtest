public class mythreadex extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("child thread");
        }
        Thread.yield();
    }
}
public class threadprioritymethod {
    public void main(String[] args) {
        mythreadex xyz = new mythreadex();
        xyz.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
}
