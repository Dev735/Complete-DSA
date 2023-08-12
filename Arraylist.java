import java.util.*;
class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();
    
         list.add(1);
         list.add(2);
         list.add(5);
         System.out.println(list);   
    
     int element=list.get(0);
     System.out.println(element);
     list.add(1,9);
     System.out.println(list);
    list.set(0,0);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);
    int size=list.size();
    System.out.println(size);
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i) + " ");

    }

    System.out.println();
    list.add(0);
    Collections.sort(list);
    System.out.println(list);
    }
}