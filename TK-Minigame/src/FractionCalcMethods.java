import java.util.ArrayList;
import java.util.List;

public class FractionCalcMethods {

    public static double dothemath (int a, int b, int c, int d, String operation) {
    double f1 = (double)a/(double)b; //creates the fractions
    double f2 = (double)c/(double)d;
double x = 0;
        if (operation.equals("-")) //unfortunately this is the method for this, and you cant just go string -> operation (at least that I could find)
            x = f1-f2; //this totally could be a switch case btw, but its 11pm and im tired
        if (operation.equals("+"))
            x = f1+f2; //this bit just DOES THE OPERATION, since the real point of my program is to go from deciaml -> fraction
        if (operation.equals("/")) //everything up until this point was just getting fractional input to turn to decimal. because thats the assignment.
            x = f1/f2;
        if (operation.equals("*"))
            x = f1*f2;
        
        return x;

    }


public static List<Integer> thefunpart(double x, double approx) {

     int i = 0; //initializes variables, i stores whether or not the fraction is negative
        double h1=1; 
        double h2=0;
        double k1=0;
        double k2=1;

        if (x < 0){
                x = -x; //needed because the math does not work otherwise
                i= 1; //checks for negative fractions, and moves negative sign to the front of the fraction
            }

            double tolerance = approx/100000; //higher tolerance means more aggresive rounding.
            double x1 = x;

            do { //creates recursive continued fractions to aproximate a fractional value for x
                double floor = Math.floor(x1);
                double save = h1; //basically, its floor(x), then you add 1/floor(x), then you add 1/floor(x) to the denominator of your existing fraction
                h1 = floor*h1+h2;  //and each time you approach a fractional value , and check that you're not above
                h2 = save; //and then you just let the computer simplify a 20+ level fraction into something nice
                save = k1; 
                k1 = floor*k1+k2;
                k2 = save;
                x1 = 1/(x1-floor);
            } while (Math.abs(x-h1/k1) > x*tolerance); //checks for remaining error, continues loop if there is error large enough to be corrected with further recursion
        
        List<Integer> solutions = new ArrayList<>();

            solutions.add(i);
            solutions.add((int) h1);
            solutions.add((int) k1);

            return solutions;
        }

    }