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

class OrdArrayString {
 private char[] a; 
 private int nElems; 
 
 public OrdArrayString (int max) { 
     this.a = new char[max];
     this.nElems = 0;
 }
 
 public int size () {
     return a.length;
 }
 
 public int find (char searchKey) {
     int i;
     for(i=0 ; i<=nElems ; i++){
         if(a[i]==(searchKey))
             return i+1;
     }
     return -1;
 } 
 
 public void insert (char value) { 
     if(size() == nElems){
         System.out.println("Array is full");
         return;
     }
     for(int i = 0; i<(size()-1); i++) {
        if(a[i]>value) {
            char temp = a[i];
            a[i] = value;
            value = temp;
        }
      }
     a[nElems] = value;
     nElems++;
 }
 
 public boolean delete (char value) {
     if(nElems == 0){
         System.out.println("Array is Empty");
         return false;
     }
     for(int i=0 ; i<nElems ; i++){
         if(a[i]==(value)){
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

public class Data_Str_lab_02_String {
    public static void main(String[] args) {
        // TODO code application logic here
        OrdArrayString x;
        x = new OrdArrayString(5);
        x.insert('B');
        x.insert('A');
        x.insert('C');
        x.insert('D');
        x.display();
        x.delete('A');
        x.display();
        x.insert('C');
        x.insert('B');
        x.display();
        System.out.println("no 7 is in " + x.find('B') + " position");
    }
}
