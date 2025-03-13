package Q_01;
import java.lang.Math;
public class one {
    public static void main(String[] args) {
        double A=10.0,B=2.0,C=5.0;
        double X=10.0,Y=3.0,r=2.0;



        double expression_a=Math.sqrt(Math.pow(B,2)+4*A*C);
        double expression_b=Math.sqrt(X+4*Math.pow(Y,3));
        double expression_c=Math.cbrt(X*Y);
        double expression_d=Math.PI*Math.pow(r,2);




        System.out.printf("%.2f%n",expression_a);
        System.out.printf("%.2f%n",expression_b);
        System.out.printf("%.2f%n",expression_c);
        System.out.printf("%.2f%n",expression_d);






    }
}
