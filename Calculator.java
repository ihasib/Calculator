
package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
public class Calculator extends JFrame{
    
    //--------buttons for digits only---------
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton zero = new JButton("0");
    
    //--------buttons for operations only--------
    private JButton next = new JButton("next");
    private JButton add = new JButton("+");
    private JButton sbt = new JButton("-");
    private JButton mul = new JButton("*");
    private JButton div = new JButton("/");
    private JButton mod = new JButton("%");

    //-------text Fields------------
    private JTextField txt1 = new JTextField(3);
    private JTextField txt2 = new JTextField(3);
    private JTextField txt3 = new JTextField("RESULT", 10); 
    	
    //constructor here public--> other classes under this package can call this
    public Calculator(){
        JPanel txt = new JPanel(new GridLayout(1, 3));
	JPanel key = new JPanel(new GridLayout(4, 4));
        
        //adding buttons to key panel
        key.add(one);
        key.add(two);
        key.add(three);
        key.add(four);
        key.add(five);
        key.add(six);
        key.add(seven);
        key.add(eight);
        key.add(nine);
        key.add(zero);
        key.add(next);
        key.add(add);
        key.add(sbt);
        key.add(mul);
        key.add(div);
        key.add(mod);
        
        //adding textfields to text panel
        txt.add(txt1);
	txt.add(txt2);
	txt.add(txt3);

        this.add(txt, BorderLayout.NORTH);
	this.add(key, BorderLayout.CENTER);
        
        txt3.setBackground(Color.LIGHT_GRAY);
	
        ButtonActionListener l=new ButtonActionListener();
        one.addActionListener(l);
        two.addActionListener(l);
	three.addActionListener(l);
	four.addActionListener(l);
	five.addActionListener(l);
	six.addActionListener(l);
	seven.addActionListener(l);
	eight.addActionListener(l);
	nine.addActionListener(l);
	zero.addActionListener(l);
        
        add.addActionListener(l);
	sbt.addActionListener(l);
	mul.addActionListener(l);
	div.addActionListener(l);
	mod.addActionListener(l);
	next.addActionListener(l);
    }   
    
        class ButtonActionListener implements ActionListener {
        private int c=0;
        public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
                    c++;
		}else if (e.getSource() == one) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"1"));
                    } else {
		    	txt2.setText(String.format(txt2.getText()+"1"));
                    }
		} else if (e.getSource() == two) {
                    if (c % 2 == 0) {
                        txt1.setText(String.format(txt1.getText()+"2"));
                    } else {
                         txt2.setText(String.format(txt2.getText()+"2"));
                    }
                } else if (e.getSource() == three) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"3"));
                    } else
                    txt2.setText(String.format(txt2.getText()+"3"));
		} else if (e.getSource() == four) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"4"));
                    } else {
                        txt2.setText(String.format(txt2.getText()+"4"));
                    }
                } else if (e.getSource() == five) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"5"));
                    } else {
                        txt2.setText(String.format(txt2.getText()+"5"));
                    }
                } else if (e.getSource() == six) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"6"));
                    } else {
			txt2.setText(String.format(txt2.getText()+"6"));
                    }
		} else if (e.getSource() == seven) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"7"));
                    } else {
			txt2.setText(String.format(txt2.getText()+"7"));
                    }
		} else if (e.getSource() == eight) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"8"));
                    } else {
			txt2.setText(String.format(txt2.getText()+"8"));
                    }
		} else if (e.getSource() == nine) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"9"));
                    } else {
			txt2.setText(String.format(txt2.getText()+"9"));
                    }
		}else if (e.getSource() == zero) {
                    if (c % 2 == 0) {
			txt1.setText(String.format(txt1.getText()+"0"));
                    } else {
			txt2.setText(String.format(txt2.getText()+"0"));
                    }
		} else{// ...............transform string to integer,calculate
					// &type RESULT
				
                    double x = Double.parseDouble(txt1.getText());
                    double y = Double.parseDouble(txt2.getText());
                    double z=0;
                    if (e.getSource() == add) {
			z = x + y;						
                    } else if (e.getSource() == sbt) {
			z = x - y;
                    } else if (e.getSource() == mul) {
			z = x * y;
                    } else if (e.getSource() == div) {
			z = x / y;
                    } else if (e.getSource() == mod) {
			z = x % y;
                    }
                    txt3.setText(String.format("%.6f", z));
		}
        }
    }
}

    