import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
           root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }

   public static Node delete(Node root,int val){
    if(root.data>val){
        root.left=delete(root.left,val);
    }
    else if(root.data<val){
        root.right=delete(root.right,val);
    }
    else{

            if(root.right==null&&root.left==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node su=inorderSuccessor(root.right);
            root.data=su.data;
            root.right=delete(root.right,su.data);
    }
return root;
   }

   public static Node inorderSuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;

   }
   public static void printInRange(Node root,int x ,int y){
    if(root==null){
        return ;
    }
    if(root.data>x&&root.data<y){
        printInRange(root.left, x, y);
        System.out.print(root.data);
        printInRange(root.right, x, y);
    }
    else if(root.data>y){
        printInRange(root.left, x, y);
    }
    else{
        printInRange(root.right, x, y);
    }

   }
   public static void printpath(ArrayList<Integer> ar){
    for(int i=0;i<ar.size();i++){
        System.out.print(ar.get(i)+"->");
    }
    System.out.println();
   }
   public static void printRootLeaf(Node root,ArrayList<Integer> ar){
    if(root==null){
        return;
    }
    ar.add(root.data);
    if(root.left==null&&root.right==null){
        printpath(ar);
    }
    else{
        printRootLeaf(root.left,ar);
        printRootLeaf(root.right,ar);
    }

   }
    public static void main(String[] args){


        int values[]={6,3,5,1,7,9,21};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root =insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printRootLeaf(root, new ArrayList<>());

    }
}
