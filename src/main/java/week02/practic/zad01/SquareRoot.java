package week02.practic.zad01;

public class SquareRoot {

	public static void main(String[] args) {
        double a = 3;
		double b = 2.5;
		double c = -0.5;

        double x1,x2;
		//PUT YOUR CODE HERE
		double d;
        d = b*b - 4*a*c;
        
        // d < 0
        if ((d<0) || ((a==0.0) && (b==0.0)) )
         {
            System.out.println("x1=");
            System.out.println("x2=");
          }
        // d >= 0
        else if ((d>=0.0) && (a!=0.0))
             {
                 x1 = (-b + Math.sqrt(d))/2/a;
                 x2 = (-b - Math.sqrt(d))/2/a;
                 System.out.println("x1=" + x1);
                 System.out.println("x2=" + x2);
             }
        // a = 0
        else if (c!=0.0) {
            x1 = x2 = -c/b;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else {
            x1 = x2 = 0.0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        
		//PUT YOUR CODE HERE
	}
}