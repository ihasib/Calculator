
package calculator;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args)
    {
        Calculator calc=new Calculator();
        calc.setTitle("Calculator");
        calc.setLocationRelativeTo(null); // Center the frame
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setSize(400, 200);
        calc.setVisible(true);
    }
}
