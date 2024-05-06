package my.javaapplication1;

public class RecIntegral {
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
}
