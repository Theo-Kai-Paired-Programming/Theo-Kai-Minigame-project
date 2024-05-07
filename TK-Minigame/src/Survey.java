import javax.swing.JOptionPane;

public class Survey {
    void mymethod() {
        String name = JOptionPane.showInputDialog ("Please Enter your name: ");
        JOptionPane.showMessageDialog(null, "Thank you, " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your age: "));
        String userin = JOptionPane.showInputDialog ("Do you think the earth is round? ");
        JOptionPane.showMessageDialog(null, "This concludes the survey");
        }
    }