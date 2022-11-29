import java.util.*;
public class Arraylistdemo {
    public static void main(String[] args){
        ArrayList l=new ArrayList();
        l.add("a");
        l.add(10);
        l.add(null);
        System.out.println(l);
        l.add("Apple");
        System.out.println(l);
        l.add("laddu");
        System.out.println(l);
        l.remove("Apple");
        System.out.println(l.isEmpty());
    }
}