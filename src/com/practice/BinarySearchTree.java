package com.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
	class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    
    public List<Integer> preorderTraversal() {
        Node root1=root;
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<Node> stack= new Stack<Node>();
        //list.add(root.key);
        while(root1!=null){

            list.add(root1.key);
            
            
        if(root1.left!=null) {
        	stack.push(root1);
            root1=root1.left;
        }
       
        else {
        	if(!stack.empty()) {
        	root1=stack.lastElement().right;
        	stack.pop();
        	}
        	else 
        		break;
        	       
        }

 
        }
        
        return list;
    } 
    
   
public void recursiveInorder(Node root) {
	if(root!=null) {
		
		recursiveInorder(root.left);
		
		recursiveInorder(root.right);
		System.out.println(root.key);
	}
	
	
}
  
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  //20,30,40,50,60,70,80
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
        // print inorder traversal of the BST 
       // tree.inorder(); 
        
       // Solution100 s= new Solution100();
       
      //  System.out.println( tree.preorderTraversal());
        tree.recursiveInorder(tree.root);
    } 
} 


