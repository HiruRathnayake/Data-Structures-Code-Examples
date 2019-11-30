/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearraydemo;

/**
 *
 * @author acer
 */
public class QueueArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        QueueArray q = new QueueArray(5);
        q.display();
        q.enqueue(7);
        q.enqueue(3);
        q.enqueue(9);
        q.enqueue(-1);
        q.enqueue(2);
        q.display();
        q.enqueue(8);
        try{
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(14);
        q.display();
        int peekValue = q.peek();
            System.out.println("Peek is " + peekValue);
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}

class QueueArray{

    private final int maxSize ;
    private final int[] queArray ;
    private int front ;
    private int rear ;
    private int nItems ; 

    public QueueArray(int size){
        this.queArray = new int[size];
        this.maxSize = size;
        this.nItems = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    public boolean isEmpty(){
        return this.nItems == 0;
    }
    
    public boolean isFull(){
        return this.nItems == this.maxSize;
    }
    
    public int size(){
        return this.nItems;
    }
    
    public void enqueue(int value){
        if(this.isFull()){
            System.out.println("Queue is already full cannot insert");
            return;
        }
        if(this.rear == this.maxSize-1)
            this.rear = 0;
        else
            this.rear++;
        this.queArray[this.rear] = value;
        this.nItems++;
        System.out.println("Value " + value + " is inserted");
    }
    
    public int dequeue() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue is already empty cannot delete");
        }
        int deleted = this.front; 
        if(this.front == this.maxSize-1)
            this.front = 0;
        else
            this.front++;
        this.nItems--;
        System.out.println("Index " + deleted + " is deleted");
        return deleted;
    }
    
    public int peek() throws Exception{
        if(this.isEmpty())
            throw new Exception("Queue is already empty cannot get front element");
        return this.queArray[this.front];
    }
    
    public void display(){
        if(this.isEmpty()){
            System.out.println("Queue is empty nothing to print");
            return;
        }
        int a = this.front;
        while(a != this.rear){
            System.out.print(this.queArray[a] + " ");
            if(a!=this.maxSize-1)
                a++;
            else 
                a = 0;
        }
        System.out.print(this.queArray[this.rear]);
        System.out.println(" ");
    }
    
}
