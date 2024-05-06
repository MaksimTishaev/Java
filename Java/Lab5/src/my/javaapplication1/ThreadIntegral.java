package my.javaapplication1;

public class ThreadIntegral extends Thread {
    private double Res = 0;
    private RecIntegral RecInt;
    ThreadIntegral(String name, RecIntegral RecInt){
        super(name);
        this.RecInt = RecInt;
    }
    
    public double getRes(){
        return this.Res;
    }
    
    void findIntegral(double a, double b, double h){
        for (double i = a; i < b; i += h)
            this.Res += ((Math.sin(i * Math.PI / 180) + Math.sin((i + h) * Math.PI / 180)) * (h / 2));
    }
    
    public void run(){
        findIntegral(RecInt.getA(), RecInt.getB(), RecInt.getH());
    }
}