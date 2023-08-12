import java.util.*;
public class BinaryTrees {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

           else{
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
           }
        }
    }
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int left=Height(root.left);
        int right=Height(root.right);
        return Math.max(left, right) +1;

    }
    public static int countofNodes(Node root){
        if(root==null){
            return 0;
        }
        int left=countofNodes(root.left);
        int right=countofNodes(root.right);
        return left+right+1;
    }
    public static int sumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int left=sumofNodes(root.left);
        int right=sumofNodes(root.right);
        return left+right+root.data;

    }
    static class Treeinfo {
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Treeinfo diameter(Node root){
        if(root==null){
            return new Treeinfo(0,0);
        }
        Treeinfo leftTr=diameter(root.left);
        Treeinfo rightTr=diameter(root.right);
        int myheight=Math.max(leftTr.ht,rightTr.ht)+1;
        int diam1=leftTr.ht+rightTr.ht+1;
        int diam2=leftTr.diam;
        int diam3=rightTr.diam;
        int mydiam=Math.max(diam1,Math.max(diam2,diam3));
        return new Treeinfo(myheight,mydiam);
    }

 

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
    }
 }
 

