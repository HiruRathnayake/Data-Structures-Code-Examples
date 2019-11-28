/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author 174137X
 */
public class LinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        x.insertFirst(9);
        x.insertFirst(7);
        x.insertFirst(21);
        x.insertFirst(5);
        x.displayList();
        x.deleteFirst();
        x.displayList();
        x.delete(2);
        x.displayList();
        
    }
    
}

class Node{

    int item;
    Node next; 
    
    public Node(int item){
        this.item = item;
        this.next = null;
    }
    
    public void display(){
        System.out.print(this.item + " ");
    }
    
}

class LinkedList{

    private Node head; //head is Object reference(memory address)
    
    public LinkedList() {
        this.head = null; //LinkedList is empty
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
 
    public void insertFirst(int i) {
        Node n = new Node(i); //create new Node
        n.next = head;
        head = n;
    }
    
    public Node deleteFirst() {
        if(isEmpty()){
            System.out.println("LinkedList is empty nothing to delete");
            return null;
        }
        Node temp = head; 
        head = head.next;
        temp.next = null;
        return temp;
    }
    
    public void displayList() {
        if(isEmpty()){
            System.out.println("LinkedList is empty nothing to print");
            return;
        }
        Node current = head;
        while(current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }
    
    public Node find(int key) {
        if(key<=0){
            System.out.println("Item is no fund in LinkedList");
            return null;
        }
        if(isEmpty()){
            System.out.println("LinkedList is empty nothing to find");
            return null;
        }
        int i = 1;
        Node current = head;
        while(current != null){
            if(i == key)
                return current;
            current = current.next;
            i++;
        }
        System.out.println("Item is no fund in LinkedList");
        return null;
    }
    
    public void delete(int key) {
        if(isEmpty()){
            System.out.println("LinkedList is empty nothing to delete");
            return;
        }
        int i = 1;
        Node current,previous;
        current = head;
        previous = head;
        while(current != null){
            if(i == key){
                if(i == 1)//condition can be current==head
                    head = head.next;
                else
                    previous.next = current.next;
                System.out.println(current.item + " was deleted");
                return;
            }
            previous = current;
            current = current.next;
            i++;
        }
        System.out.println("No item fund for the key. Deletion terminated");
    }
    
}
