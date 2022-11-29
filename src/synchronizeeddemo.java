public class synchronizeddemo {
    public static void main(String[] args) {
        display d = new display();
        mythread t1=new mythread(d,"dhoni");
        mythread t2=new mythread(d,"virat");
        t1.start();
        t2.start();
    }
}
