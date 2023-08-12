import java.util.*;
public class Stackquestion {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int tem= s.pop();
        pushAtBottom(s, data);
           s.push(tem);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
          
        int temp=s.pop();
        reverse(s);
        pushAtBottom(s, temp);
          
    }
   
    public static void main(String[] args ){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);
    
    
    
       pushAtBottom(s,5);
       
       reverse(s);
       while(!s.isEmpty()){
        System.out.print(s.pop()+" ");

      
    }
}
}
