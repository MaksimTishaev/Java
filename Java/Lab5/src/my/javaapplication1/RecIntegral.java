package my.javaapplication1;

import java.io.*;

public class RecIntegral implements Serializable {
   private double a, b, h;   
   public RecIntegral(double a, double b, double h) {
       this.a = a;
       this.b = b;
       this.h = h;
   }
   public double getA(){
       return this.a;
   }
   public double getB(){
       return this.b;
   }
   public double getH(){
       return this.h;
   }
   public static boolean isNumeric(String num) { 
       try {
           if((Double.parseDouble(num) > 0.000001 && Double.parseDouble(num) < 1000000))
               return true;
           else
               return false;
       }
       catch(NumberFormatException e) {
           return false;
       }  
   }
}