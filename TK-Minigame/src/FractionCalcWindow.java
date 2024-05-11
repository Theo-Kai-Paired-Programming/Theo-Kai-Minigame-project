import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//public class FractionCalcWindow extends JFrame implements ChangeListener
//{
//unfortunatelty the only way I found that this worked was if I just ran it directly in the app2, but you can
//picture everything under "case 3" in here if it makes you feel better (it makes me feel better)
/* I tried
public static void FractionWindow()
{

JFrame fractionframe = new JFrame("Fraction Calculator!");

fractionframe.setSize(800,600);

FractionCalcWindow ihavenoideawhattthisdoes = new FractionCalcWindow();

String[] Operators = { "+", "-", "%", "*" };

JComboBox Operator = new JComboBox(Operators);
Operator.setSelectedIndex(0);
Operator.addItemListener(ihavenoideawhattthisdoes);

fractionframe.add(Operator);

Operator.setSize(30,30);
Operator.setAlignmentX(400);
Operator.setAlignmentY(100);

fractionframe.setVisible(true);
*/