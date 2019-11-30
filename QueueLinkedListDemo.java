/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedliskdemo;

import java.util.NoSuchElementException;

/**
 *
 * @author acer
 */
public class QueueLinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList(); 
        q.display();
        q.insert(24);
        q.insert(5);
        q.insert(9);
        q.insert(72);
        q.insert(14);
        q.insert(1);
        q.display();
        int peekValue1 = q.peek();
        System.out.println("Peek is " + peekValue1);
        q.remove();
        q.remove();
        q.remove();
        q.display();
        q.remove();
        q.remove();
        q.display();
        int peekValue2 = q.peek();
        System.out.println("Peek is " + peekValue2);
        q.remove();
        q.display();
    }
    
}

class Node{
    protected int data;
    protected Node link;
 
    public Node(){ /*Constructor*/
        link = null;
        data = 0;
    }    
    public Node(int d,Node n){ /*Constructor*/
        data = d;
        link = n;
    }    
    public void setLink(Node n){ /*Function to set link to next Node*/
        link = n;
    }      
    public Node getLink(){ /*Function to get link to next node*/
        return link;
    }    
    public int getData(){  /*Function to get data from current Node*/
        return data;
    }
}

class QueueLinkedList { 
    
    protected Node front, rear;
    public int size;
 
    public QueueLinkedList(){ /*Constructor*/
        front = null;
        rear = null;
        size = 0;
    }    
    public boolean isEmpty(){ 
        return front == null;
    }    
    public void insert(int data){ /*Function to insert an element to the queue*/
        Node nptr = new Node(data, null);
        if (rear == null){
            front = nptr;
            rear = nptr;
        }else{
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++ ;
    }    
    public int remove(){ /*Function to remove front element from the queue*/
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();        
        if (front == null)
            rear = null;
        size-- ;        
        return ptr.getData();
    }    
    public int peek(){ /*Function to check the front element of the queue*/
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }    
    public void display(){ /*Function to display the status of the queue*/
        System.out.print("\nQueue = ");
        if (size == 0){
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink()){
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}
