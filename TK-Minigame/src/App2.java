import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class App2 implements ChangeListener { //this also, apparently, MUST exist for the slider to work
    public static void main(String[] args) {    
        

        String pswd = "";

        while (!pswd.equals("password123")) {
        pswd = JOptionPane.showInputDialog("Enter the Password");
        System.out.println("aaa" + pswd + "aaa");

        }

        JOptionPane.showMessageDialog(null, "Correct password");

        Object[] gameslist = {"Prime Checker", "Survey", "Guess The Number", "Fraction Approximator", "quit"};

    while (true) {
        int n = JOptionPane.showOptionDialog(null, //figure out how to harvest this value
                        "Please select the program you'd like to use",
                        "ProgramSelector3000",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        gameslist,
                        null);

        System.out.println(n);
                switch (n) {
                    case 0:
                        WillansFormula PrimeObject = new WillansFormula();
                        String numex = JOptionPane.showInputDialog("Enter the number who's primality you'd like to check. \n Please only enter a number less than 20");
                        PrimeObject.PrimeChecker(Integer.valueOf(numex));
                    break;
                    case 1:
                    Survey surveyObject = new Survey();
                        surveyObject.mymethod();
                        break;
                    case 2:
                    GuessNumber guessObject = new GuessNumber();
                    guessObject.myMethod();
                    case 3:
                    
                        String decimal = JOptionPane.showInputDialog("Please enter a decimal value you would like to approximate");

                        JFrame f = new JFrame("How tight of an approximation do you want. Lower values will yield more unwieldy fractions");
                        //I dont know why this whole bit doesnt happen, I'm honestly exhausted to the highest of extremes but let it be know to all who look upon and judge me and this code that I. Have. Tried
                        JPanel p = new JPanel();

                        JSlider b = new JSlider(1, 100, 50);

                        p.add(b);

                        f.add(p);

                        f.setSize(300, 300);

                        double approx = b.getValue();

                        List<Integer> solutions = FractionCalcMethods.thefunpart(Double.parseDouble(decimal), approx);

                        String plusminus = "";


                        if (solutions.get(0) == 1)
                            {
                                plusminus = "- ";
                            }


                        JOptionPane.showMessageDialog(null, "Your final fraction is:\n\n " + plusminus + solutions.get(1) + "/" + solutions.get(2));
                            break;
                    case 4:
                    System.exit(0);
                }
                }


            }

    @Override //apparently this MUST exist for some ungodly reason ^^. which is why it had to be in this file
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'stateChanged'");
    }

    
    }




