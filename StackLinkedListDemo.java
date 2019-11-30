/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklinkedlistdemo;
import static java.lang.System.exit;
/**
 *
 * @author acer
 */
public class StackLinkedListDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        StackUsingLinkedlist obj = new StackUsingLinkedlist(); 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
        obj.display(); 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
        obj.pop(); 
        obj.pop(); 
        obj.display(); 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    }   
}

class Node { 
    int data; // integer data 
    Node link; // reference variavle Node type 
} 

class StackUsingLinkedlist { 
  
    Node top; 
    StackUsingLinkedlist(){ 
        this.top = null; 
    } 
    public void push(int x){   
        Node temp = new Node(); 
        temp.data = x; 
        temp.link = top; 
        top = temp; 
    } 
    public boolean isEmpty() { 
        return top == null; 
    } 
    public int peek() throws Exception { 
        if (!isEmpty())
            return top.data; 
        else { 
            throw new Exception("Stack is empty cannot get peek value"); 
        } 
    } 
    public void pop() throws Exception{  
        if (top == null) { 
            throw new Exception("Stack is empty cannot pop");
        } 
        top = top.link; 
    } 
    public void display(){ 
        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
            exit(1); 
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
                System.out.printf("%d ", temp.data); 
                temp = temp.link; 
            } 
        } 
    } 
}
