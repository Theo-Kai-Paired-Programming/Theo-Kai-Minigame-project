import javax.swing.JOptionPane;

public class WillansFormula {

    public static long factorial(int n) { //defines a method that uses a for loop to find the factorial of a number
        long f = 1; //uses longs instead of doubles because factorials can only be whole numbers
        for (int i = 2; i <= (int) n; i++) { 
            f *= i;
        }
        return f;
    }

        public void PrimeChecker (int num) {

    double numd = (double) num;

        double result = ((factorial(num-1)+1)/numd);

        if (result == Math.floor(result) && num != 1)    
        JOptionPane.showMessageDialog(null, "Prime!");
        else
        JOptionPane.showMessageDialog(null, "Not Prime");


    }
}
