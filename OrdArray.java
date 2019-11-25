/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_str_lab_02;

/**
 *
 * @author acer
 */

class OrdArray {
 private long[] a; 
 private int nElems; 
 
 public OrdArray (int max) { 
     this.a = new long[max];
     this.nElems = 0;
 }
 
 public int size () {
     return a.length;
 }
 
 public int find (long searchKey) {
     int i;
     for(i=0 ; i<=nElems ; i++){
         if(a[i]==searchKey)
             return i+1;
     }
     return -1;
 } 
 
 public void insert (long value) { 
     if(size() == nElems){
         System.out.println("Array is full");
         return;
     }
     long temp;
     for(int i=0 ; i<nElems ; i++){
         if(a[i]>value){
             temp = a[i];
             a[i] = value;
             value = temp;
         }
     }
     a[nElems] = value;
     nElems++;
 }
 
 public boolean delete (long value) {
     if(nElems == 0){
         System.out.println("Array is Empty");
         return false;
     }
     for(int i=0 ; i<nElems ; i++){
         if(a[i] == value){
             for(int j=i ; j<(nElems-1) ; j++){
                 a[j] = a[j+1];
             }
             nElems--;
             System.out.println("Value deleted");
             return true;
         }
     }
     System.out.println("value not found for delete");
     return false;
 } 
 
 public void display () { 
     for(int i=0; i<nElems ; i++){
        System.out.print(a[i]+" ");
     }
     System.out.println("");
 }
 
}

public class Data_Str_lab_02 {

   public static void main(String[] args) {
        OrdArray x;
        x = new OrdArray(5);
        x.insert(7);
        x.insert(3);
        x.insert(8);
        x.insert(6);
        x.display();
        x.delete(3);
        x.display();
        x.insert(7);
        x.insert(6);
        x.display();
        System.out.println("no 7 is in " + x.find(7) + " position");
    }
    
}
