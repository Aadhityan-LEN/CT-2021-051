package Q1;
import javax.swing.*;

public class Sum3Int{
    public static void main(String[] args) {
        // Input three integers using JOptionPane
        String input1 = JOptionPane.showInputDialog("Enter the 1st integer : ");
        String input2 = JOptionPane.showInputDialog("Enter the 2nd integer : ");
        String input3 = JOptionPane.showInputDialog("Enter the 3rd integer : ");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);

        int sum = num1+num2+num3;

        JOptionPane.showMessageDialog(null,"sum of 3 integers : " + sum);
    }
}
