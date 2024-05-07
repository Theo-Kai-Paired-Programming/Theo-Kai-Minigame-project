import javax.swing.JOptionPane;

public class App2 { 
    


    public static void main(String[] args) {

        String pswd = "";

        while (!pswd.equals("password123")) {
        pswd = JOptionPane.showInputDialog("Enter the Password");
        System.out.println("aaa" + pswd + "aaa");

        }

        JOptionPane.showMessageDialog(null, "Correct password");

        Object[] gameslist = {"Trivia", "Survey", "Calendar", "Option4"};

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
                System.out.println("run trivia");
                break;
            case 1:
                System.out.println("run survey");
                break;
            case 2:
                System.out.println("run Calendar");
                break;
            case 3:
                System.out.println("run option4");
        }



        }
    }
