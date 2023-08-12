import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
    map.put(1,"It");
    map.put(2,"Mechanical");
    map.put(3,"Civil");
    map.put(4,"Electronics"); 

    //same key 4
    map.put(4, "Electrical");
    //new value of 4 will be Electrical

    if(map.containsKey(1)){
        System.out.println("Key is present");
    }
        else{
            System.out.println("Key is not present");
        }


        System.out.println(map.get(1)); //key exists
        System.out.println(map.get(6)); //key doesn't exist
 
     for(Map.Entry<Integer,String> e: map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
     }
     Set<Integer> keys=map.keySet();
     for( Integer key:keys){
        System.out.println(key+" "+map.get(key));
     }
    }


}

