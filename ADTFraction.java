/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_str_lab_03;

/**
 *
 * @author acer
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class ADTFraction{

private int n;//numerator
private int d; //denomenator

 public ADTFraction (){//parameter constructor
     this.n = 0;
     this.d = 1;
 }

 public ADTFraction (int a, int b){//parameter constructor
     if(b!=0){
        this.n = a;
        this.d = b;
     }else{
        System.out.println("Denominator can not ba zero ");
     }
     reduce();
 }
 
 public int calculateGCD(int numerator, int denominator) {
    if (numerator % denominator == 0) {
        return denominator;
    }
    return calculateGCD(denominator, numerator % denominator);
}
 
 void reduce() {
    int gcd = calculateGCD(n, d);
    n /= gcd;
    d /= gcd;
 }

 public ADTFraction plus (ADTFraction x){ //add two fractions
    int newNumerator = ((this.n *x.d)+(this.d*x.n));
    int newDenominator = this.d * x.d;
    ADTFraction r = new ADTFraction(newNumerator, newDenominator);
    return r;
 }
 
 public ADTFraction times (int a){//multiply fraction by a number
    int newNumerator = (this.n *a);
    int newDenominator = this.d;
    ADTFraction r = new ADTFraction(newNumerator, newDenominator);
    return r;
 }
   
 
 public ADTFraction times (ADTFraction x){//multiply two fractions
    int newNumerator = ((this.n*x.d)+(this.d*x.n));
    int newDenominator = this.d * x.d;
    ADTFraction r = new ADTFraction(newNumerator, newDenominator);
    return r;
 }

 public ADTFraction reciprocal (){//reciprocal of a fraction
    ADTFraction r = new ADTFraction(this.d, this.n);
    return r; 
 }
 
 public ADTFraction divide(ADTFraction x) {//divide two fractions
    int newNumerator = this.n * x.d;
    int newDenominator = this.d * x.n;
    ADTFraction r = new ADTFraction(newNumerator, newDenominator);
    return r;
 }
 
 public float value (){
     float value = ((float)this.n/(float)this.d);
     return value;
 }
 
 public void display (){
     System.out.println(this.n + "/" + this.d);
 }

}

public class Data_Str_lab_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ADTFraction a1 = new ADTFraction();
       a1.display();
       System.out.println(a1.value());
       System.out.println("-------01");
       
       ADTFraction a2 = new ADTFraction(4,2);
       a2.display();
       System.out.println(a2.value());
       System.out.println("-------02");
       
       ADTFraction a3 = new ADTFraction(4,2);
       a3.display();
       System.out.println(a3.value());
       System.out.println("-------03");
       
       ADTFraction a4 = new ADTFraction(4,2);
       ADTFraction a5 = new ADTFraction(6,3);
       ADTFraction a6 = a4.plus(a5);
       a6.display();
       System.out.println(a6.value());
       System.out.println("-------04");
       
       ADTFraction a7 = new ADTFraction(4,2);
       ADTFraction a8 = a7.times(3);
       a6.display();
       System.out.println(a8.value());
       System.out.println("-------05");
       
       ADTFraction a9 = new ADTFraction(4,2);
       ADTFraction a10 = new ADTFraction(6,3);
       ADTFraction a11 = a10.times(a9);
       a6.display();
       System.out.println(a11.value());
       System.out.println("-------06");
       
       ADTFraction a12 = new ADTFraction(4,2);
       ADTFraction a13 = a12.reciprocal();
       a13.display();
       System.out.println(a13.value());
       System.out.println("-------07");
       
       ADTFraction a14 = new ADTFraction(4,2);
       ADTFraction a15 = new ADTFraction(6,3);
       ADTFraction a16 = a14.divide(a15);
       a6.display();
       System.out.println(a16.value());
    }
    
}
