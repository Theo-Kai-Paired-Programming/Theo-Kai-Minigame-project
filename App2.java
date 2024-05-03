package newthing;
import javax.swing.JOptionPane;

public class App2 { //should this file perhaps be called main.java?
    


    public static void main(String[] args) {

        String pswd = "";

        while (!pswd.equals("password123")) {
        pswd = JOptionPane.showInputDialog("Enter the Password");
        System.out.println("aaa" + pswd + "aaa");

        }

        JOptionPane.showMessageDialog(null, "Correct password");

        Object[] gameslist = {"Trivia",
                 "Survey", "Calendar", "Option4"};

JOptionPane.showOptionDialog(null, //figure out how to harvest this value
                 "Please select the program you'd like to use",
                 "ProgramSelector3000",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,
                 null,
                 gameslist,
                 null);

        trueOrFalse tfObject = new trueOrFalse();
        tfObject.trueFalseGame();
    }
}
