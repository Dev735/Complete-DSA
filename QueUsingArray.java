public class QueUsingArray {
    static class Queue{
        static int  arr[];
        static int size;
         static int rear;
        Queue(int size){
            this.size=size;
            arr=new int[size];
            rear = -1;
        }
    

    public static boolean isEmpty(){
        
        return rear == -1;
    }
public static boolean isFull(){
    return rear== size-1;
}

public static void add(int data){
if(isFull()){
    System.out.println("Overflow");
    return;
}
arr[++rear]=data;

}
public static int remove(){
    if(isEmpty()){
        System.out.println("Empty Queue");
        return -1;
    }
    int front =arr[0];
    for(int i=0;i<rear;i++){
        arr[i]=arr[i+1];
        rear--;
       
    }
    return front;

}
public static int peek(){
    if(isEmpty()){
        System.out.println("Empty Queue");
        return -1;
    }
return arr[0];

}
}

}
