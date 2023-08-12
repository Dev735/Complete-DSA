public class Linkedlist {
    node head;
    private int size;
    Linkedlist(){
        size =0;
    }

   public class node{
    String data;
    node next;
    node(String data){
          this.data=data;
          this.next=null;
            size++;
    }
   }
     
public void addFirst(String data){
    node newnode=new node(data);
    newnode.next=head;
    head=newnode;

}

public void addLast(String data){

    node newnode=new node(data);

if(head==null){
    head=newnode;
    return;
}
    node lastnode =head;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
    }
    lastnode.next=newnode;
}
   

    

    public void printList(){
        node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }


        System.out.println("null");
          

    }



    public void removeFirst(){
        if(head==null){
            System.out.println("Empty List,Nothing to delete");
            return;
        }

        head=this.head.next;
        size--;
    }


    public void removeLast(){
        if(head==null){
            System.out.println("Empty List,Nothing to delete");
            return;
        }

        if(head.next==null){
            head=null;
        }
        node currnode=head;
        node last=head.next;

        while(last!=null){
            currnode=currnode.next;
            last=last.next;
        }
        currnode.next=null;


    }

    public int getSize() {
        return size;
    }
  
 
    public void add(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;
 
 
        node newNode = new node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
         node currNode = head;
        for(int i=0;i<size;i++){
            if(i==index){
                node nextnode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextnode;
                break;
            }

            currNode=currNode.next;
        }
    }
 
 public void reverseList(){
    if(head==null||head.next==null){
        return;
    }
    node prev=head;
    node curr=head.next;
    while(curr!=null){
        node newnode=curr.next;
        curr.next=prev;

        /*update */
        prev=curr;
        curr=newnode;

    }
    head.next=null;
    head=prev;

 }



 public node reverseListRecursive(node head) {
    //empty node || last node or only one node
    if(head == null || head.next == null) {
        return head;
    }
    node newHead = reverseListRecursive(head.next);

    head.next.next=head.next;
    head.next=null;
    return newHead;

}

 
    public static void main(String args[]) {
        Linkedlist list = new Linkedlist();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.printList();
 
 
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize()); 
 
 
        list.removeFirst();
        list.printList();
 
 
        list.removeLast();
        list.printList();
        list.add(1, "2");
        list.printList();
        list.reverseList();
        list.printList();
        

    }
}
