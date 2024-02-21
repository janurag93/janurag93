import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyCal extends JFrame implements ActionListener{
    ImageIcon calIcon;
    JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,plus,minus,div,mul,equal,dot,clc;
    static Double result, firstOperand,secondOperand;
    static String operator,firstOperandString, fullString;
    static int index;
    static JTextField resField= new JTextField("0",45);
    

    MyCal(){
            
            setTitle("My Calculator");
            setSize(500, 500);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calIcon=new ImageIcon("calIcon.png");
            setIconImage(calIcon.getImage());
            
            resField.setSize(500, 1000);
            resField.setEditable(false);
            Font font = resField.getFont();
            resField.setFont(font.deriveFont(50f));
            add(resField, BorderLayout.NORTH);
            JPanel eastPanel = new JPanel(null);
            eastPanel.setPreferredSize(new Dimension(20, 300));
            JPanel westPanel = new JPanel(null);
            westPanel.setPreferredSize(new Dimension(20, 300));
            JPanel soutPanel = new JPanel(null);
            soutPanel.setPreferredSize(new Dimension(400, 20));
            JPanel calPanel=new JPanel( new GridLayout(3,6));
            calPanel.setPreferredSize(new Dimension(400, 300));
           // calPanel.setLayout(getLayout());
            
// button
            clc = new JButton("CLC");
            clc.setPreferredSize(new Dimension(50, 50));
            n0 = new JButton("0");
            n1 = new JButton("1");
            n2 = new JButton("2");
            n3 = new JButton("3");
            n4 = new JButton("4");
            n5 = new JButton("5");
            n6 = new JButton("6");
            n7 = new JButton("7");
            n8 = new JButton("8");
            n9 = new JButton("9");
            equal = new JButton("=");
            plus = new JButton("+");
            minus = new JButton("-");
            div = new JButton("/");
            mul = new JButton("*");
            dot = new JButton(".");  
// adding action listener to button
            clc.addActionListener(this);
            n0.addActionListener(this);
            n1.addActionListener(this);
            n2.addActionListener(this);
            n3.addActionListener(this);
            n4.addActionListener(this);
            n5.addActionListener(this);
            n6.addActionListener(this);
            n7.addActionListener(this);
            n8.addActionListener(this);
            n9.addActionListener(this);
            plus.addActionListener(this);
            minus.addActionListener(this);
            div.addActionListener(this);
            mul.addActionListener(this);
            dot.addActionListener(this);
            equal.addActionListener(this);
//add button to panel
            calPanel.add(clc);
            calPanel.add(n0);
            calPanel.add(n1);
            calPanel.add(n2);
            calPanel.add(n3);
            calPanel.add(n4);
            calPanel.add(n5);
            calPanel.add(n6);
            calPanel.add(n7);
            calPanel.add(n8);
            calPanel.add(n9);
            calPanel.add(plus);
            calPanel.add(minus);
            calPanel.add(div);
            calPanel.add(mul);
            calPanel.add(equal);
            calPanel.add(dot);
            
            // result field added
            add(soutPanel,BorderLayout.SOUTH);
            add(westPanel,BorderLayout.WEST);
            add(calPanel,BorderLayout.CENTER);
            add(eastPanel,BorderLayout.EAST);
            setVisible(true);
    }
    public static void assign (String i){
            resField.setText(resField.getText()+i);
    }
    public static void calculate (){
        switch (operator) {
            case "+":
            System.out.println("trying to calculate");
            System.out.println(resField.getText());
            fullString=resField.getText();
            System.out.println("First string :"+firstOperandString);
            System.out.println(fullString.replace(firstOperandString, ""));
            secondOperand=Double.parseDouble(fullString.replace(firstOperandString, ""));
                result=firstOperand+secondOperand;
                resField.setText(String.valueOf(result));
                break;
            case "-":
                //System.out.println("trying to calculate");
                //System.out.println(resField.getText());
                fullString=resField.getText();
                //System.out.println("First string :"+firstOperandString);
                //System.out.println(fullString.replace(firstOperandString, ""));
                secondOperand=Double.parseDouble(fullString.replace(firstOperandString, ""));
                result=firstOperand-secondOperand;
                resField.setText(String.valueOf(result));
                break;
            case "*":
                //System.out.println("trying to calculate");
                //System.out.println(resField.getText());
                fullString=resField.getText();
                //System.out.println("First string :"+firstOperandString);
                //System.out.println(fullString.replace(firstOperandString, ""));
                secondOperand=Double.parseDouble(fullString.replace(firstOperandString, ""));
                result=firstOperand*secondOperand;
                resField.setText(String.valueOf(result));
                break;
            case "/":
                //System.out.println("trying to calculate");
                //System.out.println(resField.getText());
                fullString=resField.getText();
                //System.out.println("First string :"+firstOperandString);
                //System.out.println(fullString.replace(firstOperandString, ""));
                secondOperand=Double.parseDouble(fullString.replace(firstOperandString, ""));
                if (secondOperand==0) {
                    resField.setText("Undefined");
                } else {
                    result=firstOperand/secondOperand;
                resField.setText(String.valueOf(result));
                }
                
                break;
            default:
                break;
        }
        resField.setText(resField.getText());
}
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==n1) assign("1");
        else if(e.getSource()==clc) resField.setText(String.valueOf(0));
        else if(e.getSource()==n2) assign("2");
        else if (e.getSource()==n3) assign("3");
        else if (e.getSource()==n4) assign("4");
        else if (e.getSource()==n5) assign("5");
        else if (e.getSource()==n6) assign("6");
        else if (e.getSource()==n7) assign("7");
        else if (e.getSource()==n8) assign("8");
        else if (e.getSource()==n9) assign("9");
        else if (e.getSource()==n0) assign("0");
        else if (e.getSource()==plus) 
        {
            operator="+";
            firstOperandString=resField.getText()+operator;
            System.out.println(resField.getText());
           firstOperand=Double.parseDouble(resField.getText());
           
            index=resField.getText().length();
            assign("+");
        }
        else if (e.getSource()==minus)
        { 
           operator="-" ;
           firstOperandString=resField.getText()+operator;
           // System.out.println(resField.getText());
           firstOperand=Double.parseDouble(resField.getText());
           
            index=resField.getText().length();
            assign("-");
        }
        else if (e.getSource()==mul) 
        {
            operator="*" ;
            firstOperandString=resField.getText()+operator;
           // System.out.println(resField.getText());
           firstOperand=Double.parseDouble(resField.getText());
           
            index=resField.getText().length();
            assign("*");
        }
        else if (e.getSource()==div)
         {
            operator="/" ;
            firstOperandString=resField.getText()+operator;
           // System.out.println(resField.getText());
           firstOperand=Double.parseDouble(resField.getText());
           
            index=resField.getText().length();
            assign("/");
        }
        else if (e.getSource()==dot) assign(".");
        else calculate();
            
        
       
       // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
