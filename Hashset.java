import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println("Size of set is " +set.size());
        

       if(!set.contains(6)) {
        System.out.println("absent");
    }


    //Delete
    set.remove(1);
    if(!set.contains(1)) {
        System.out.println("absent");
    }


    //Print all elements
    System.out.println(set);
    set.remove(2);
    set.add(1);
    Iterator it =set.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    }
}
