public class StackLL {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;

        }

    }

    static class Stack{
        public static Node head=null;
        public void push(int data){
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        } 
        public static boolean isEmpty(){
            return head==null;
        }

        public int pop(){
            if(head==null){
                return -1;
            }

            Node top=head;
            head=head.next;
            return top.data;
        }

        public int peek(){
            if(head==null){
                return -1;
            }
      Node top=head;
      return top.data;

        }

       
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
}
}
