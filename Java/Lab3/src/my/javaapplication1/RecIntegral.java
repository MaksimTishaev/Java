package my.javaapplication1;

import java.io.*;

public class RecIntegral implements Serializable {
   private double a, b, h;   
   public RecIntegral(double a, double b, double h) {
       this.a = a;
       this.b = b;
       this.h = h;
   }
   public double geta(){
       return this.a;
   }
   public double getb(){
       return this.b;
   }
   public double geth(){
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