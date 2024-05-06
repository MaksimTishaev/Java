/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.javaapplication1;

public class RecIntegralException extends Exception {
    private double a, b, h;
    public double geta(){
       return this.a;
   }
   public double getb(){
       return this.b;
   }
   public double geth(){
       return this.h;
   }
   public RecIntegralException(){
   }
    
}
