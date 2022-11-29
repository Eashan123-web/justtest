import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlistdemo {
        public static void main(String[] args){
            LinkedList l=new LinkedList();
            l.add("game");
            l.add(300);
            l.add(null);
            System.out.println(l);
            l.add("jhanvi");
            System.out.println(l);
            l.add("vaishu");
            System.out.println(l);
            l.remove("badminton");
            System.out.println(l.isEmpty());
            System.out.println(l.contains("fruits"));
            System.out.println(l.size());
            l.addLast("riya");
            l.addFirst("shivanshi");
            l.getFirst();
            l.getLast();
            System.out.println(l);

        }
    }
