import javax.swing.JOptionPane;

public class GuessNumber {
    void myMethod() {
    boolean Ltracker = true;
    JOptionPane.showMessageDialog(null, "Can you guess my random number? The range is 1 to 100");
    int gn = 3;
        while(Ltracker == true) {
            int Usern = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess: "));
            if (Usern > gn) {
                JOptionPane.showMessageDialog(null, "Your guess is larger");
                Ltracker = true; 
                }
            else if (Usern < gn){
            JOptionPane.showMessageDialog(null, "Your guess is smaller");
            Ltracker = true; 
            }
            else {
                JOptionPane.showMessageDialog(null, "Nice Job, you guessed my number");
                Ltracker = false;
            }
        }
    }
}
