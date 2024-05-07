import javax.swing.JOptionPane;

public class App2 {
    public static void main(String[] args) {    

        String pswd = "";

        while (!pswd.equals("password123")) {
        pswd = JOptionPane.showInputDialog("Enter the Password");
        System.out.println("aaa" + pswd + "aaa");

        }

        JOptionPane.showMessageDialog(null, "Correct password");

        Object[] gameslist = {"Prime Checker", "Survey", "Calendar", "Guess The Number", "quit"};

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
                        System.out.println("run survey");
                        break;
                    case 2:
                        System.out.println("run Calendar");
                        break;
                    case 3:
                    GuessNumber guessObject = new GuessNumber();
                    guessObject.myMethod();
                        break;
                    case 4:
                    System.exit(0);

                }
                }

                
            }
    }
