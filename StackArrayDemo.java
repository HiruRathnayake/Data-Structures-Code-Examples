/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarraydemo;

/**
 *
 * @author acer
 */
public class StackArrayDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackArray1 s = new StackArray1(4);
        s.push(21);
        s.push(6);
        s.push(-5);
        s.push(9);
        s.display();
        try{
           int k ;
           k =s.pop();
           System.out.println("Pop value is "+ k);
           s.display();
           k = s.pop();
           System.out.println("Pop value is "+ k);
           s.display();
           k = s.pop();
           System.out.println("Pop value is "+ k);
           s.display();
           k = s.pop();
           System.out.println("Pop value is "+ k);
           s.display();
           k = s.pop();
           System.out.println("Pop value is "+ k);
           s.display();
        }
        catch(Exception e){
           System.out.println(e);
        }
    }
}

class StackArray1{

    private final int maxSize;
    private final int [] StackData;
    private int top;

    public StackArray1 (int s){
        this.StackData = new int[s];
        this.maxSize = s;
        this.top = -1;//initial top when a stack array is empty
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.top == this.maxSize - 1;
    }
    public void push(int j){
        if(isFull()){
            System.out.println("Stack is full cannot pus");
            return;
        }
        this.top++;
        this.StackData[top]= j;
        System.out.println("Value "+ j +" pushed");
    }
    public int pop()throws Exception{
        if(isEmpty())
             throw new Exception("Stack is empty cannot pop");
        this.top--;
        return StackData[top+1];
    }
    public int peek()throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty cannot get peek value");
        return StackData[top];
    }
    public void display(){
        System.out.print("Stack Elements: ");       
        for(int i=top;i>=0;i--)
            System.out.print(StackData[i]+" ");
        System.out.println();
    }
}

