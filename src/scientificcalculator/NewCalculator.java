//Group#16
//Shees Khan (FA23-BCS-140)
//Hassan Raza Khan (FA23-BCS-139)
//Qazi Abdullah (FA23-BCS-146)

package scientificcalculator;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class NewCalculator extends JFrame{
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final InFIxEvaluate evaluator = new InFIxEvaluate();
    private JPanel contentPane;
    private JTextField textField;

    private JButton Button_0;
    private JButton Button_1;
    private JButton Button_2;
    private JButton Button_3;
    private JButton Button_4;
    private JButton Button_5;
    private JButton Button_6;
    private JButton Button_7;
    private JButton Button_8;
    private JButton Button_9;

    private JButton Button_dot;
    private JButton Button_Addition;
    private JButton Button_Subtraction;
    private JButton Button_Mutiplication;
    private JButton Button_Division;
    private JButton Button_Equal;

    private JButton Button_Sin;
    private JButton Button_Cos;
    private JButton Button_Tan;

    private JButton Button_Factorial;
    private JButton Button_Log;
    private JButton Button_Power;
    private JButton Button_Square;
    private JButton Button_Sqrt;

    private JButton Button_Delete;
    private JButton Button_Clear;
    private JButton Button_Exit;

    private JButton Button_SBracket;
    private JButton Button_EBracket;

    JRadioButton rdbtn_OFF;
    JRadioButton rdbtn_ON;

    double num1, num2, result;
    double num, ans;
    char operator;

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewCalculator frame = new NewCalculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
    public NewCalculator() {
        setVisible(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MAQzone\\Downloads\\Capture.PNG"));
        setTitle("CASIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(370, 100, 384, 487);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(45, 45, 48)); // Dark background
        contentPane.setBorder(new EmptyBorder(6, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel ButtonsPanel = new JPanel();
        ButtonsPanel.setBounds(25, 115, 315, 303);
        ButtonsPanel.setBackground(new Color(60, 60, 65)); // Darker panel

        contentPane.add(ButtonsPanel);
        ButtonsPanel.setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 25, 350, 68);
        contentPane.add(textField);
        textField.setToolTipText("CASIO LIMITED EDITION");
        textField.setBackground(new Color(30, 30, 30)); // Very dark background
        textField.setForeground(new Color(220, 220, 220)); // Light text
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 38));
        textField.setColumns(10);

        Button_0 = new JButton("0");
        Button_0.setBackground(new Color(80, 80, 80)); // Dark gray
        Button_0.setForeground(Color.WHITE);
        Button_0.setToolTipText("ZERO");
        Button_0.setFocusable(false);
        Button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        Button_0.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_0.setBounds(126, 251, 62, 49);
        ButtonsPanel.add(Button_0);

        Button_1 = new JButton("1");
        Button_1.setBackground(new Color(80, 80, 80));
        Button_1.setForeground(Color.WHITE);
        Button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        Button_1.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_1.setBounds(63, 201, 62, 49);
        ButtonsPanel.add(Button_1);

        Button_2 = new JButton("2");
        Button_2.setBackground(new Color(80, 80, 80));
        Button_2.setForeground(Color.WHITE);
        Button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        Button_2.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_2.setBounds(126, 201, 62, 49);
        ButtonsPanel.add(Button_2);

        Button_3 = new JButton("3");
        Button_3.setBackground(new Color(80, 80, 80));
        Button_3.setForeground(Color.WHITE);
        Button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        Button_3.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_3.setBounds(189, 201, 62, 49);
        ButtonsPanel.add(Button_3);

        Button_4 = new JButton("4");
        Button_4.setBackground(new Color(80, 80, 80));
        Button_4.setForeground(Color.WHITE);
        Button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        Button_4.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_4.setBounds(63, 151, 62, 49);
        ButtonsPanel.add(Button_4);

        Button_5 = new JButton("5");
        Button_5.setBackground(new Color(80, 80, 80));
        Button_5.setForeground(Color.WHITE);
        Button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        Button_5.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_5.setBounds(126, 151, 62, 49);
        ButtonsPanel.add(Button_5);

        Button_6 = new JButton("6");
        Button_6.setBackground(new Color(80, 80, 80));
        Button_6.setForeground(Color.WHITE);
        Button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        Button_6.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_6.setBounds(189, 151, 62, 49);
        ButtonsPanel.add(Button_6);

        Button_7 = new JButton("7");
        Button_7.setBackground(new Color(80, 80, 80));
        Button_7.setForeground(Color.WHITE);
        Button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        Button_7.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_7.setBounds(63, 101, 62, 49);
        ButtonsPanel.add(Button_7);

        Button_8 = new JButton("8");
        Button_8.setBackground(new Color(80, 80, 80));
        Button_8.setForeground(Color.WHITE);
        Button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        Button_8.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_8.setBounds(126, 101, 62, 49);
        ButtonsPanel.add(Button_8);

        Button_9 = new JButton("9");
        Button_9.setBackground(new Color(80, 80, 80));
        Button_9.setForeground(Color.WHITE);
        Button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        Button_9.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_9.setBounds(189, 101, 62, 49);
        ButtonsPanel.add(Button_9);

        Button_dot = new JButton(".");
        Button_dot.setBackground(new Color(80, 80, 80));
        Button_dot.setForeground(Color.WHITE);
        Button_dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().contains("."))
                    return;
                textField.setText(textField.getText() + ".");
            }
        });
        Button_dot.setFocusable(true);
        Button_dot.setToolTipText("Decimal Point");
        Button_dot.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_dot.setBounds(189, 251, 62, 49);
        ButtonsPanel.add(Button_dot);

        Button_Addition = new JButton("+");
        Button_Addition.setBackground(new Color(60, 60, 65));
        Button_Addition.setForeground(new Color(0, 200, 255)); // Light blue
        Button_Addition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
            }
        });
        Button_Addition.setToolTipText("Addition Operation");
        Button_Addition.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Addition.setBounds(252, 201, 62, 49);
        ButtonsPanel.add(Button_Addition);

        Button_Subtraction = new JButton("-");
        Button_Subtraction.setBackground(new Color(60, 60, 65));
        Button_Subtraction.setForeground(new Color(0, 200, 255));
        Button_Subtraction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "-");
            }
        });
        Button_Subtraction.setToolTipText("Subtraction Operation");
        Button_Subtraction.setFont(new Font("Verdana", Font.PLAIN, 20));
        Button_Subtraction.setBounds(252, 151, 62, 49);
        ButtonsPanel.add(Button_Subtraction);

        Button_Mutiplication = new JButton("x");
        Button_Mutiplication.setBackground(new Color(60, 60, 65));
        Button_Mutiplication.setForeground(new Color(0, 200, 255));
        Button_Mutiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "*");
            }
        });
        Button_Mutiplication.setToolTipText("Multiplication Operation");
        Button_Mutiplication.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Mutiplication.setBounds(252, 101, 62, 49);
        ButtonsPanel.add(Button_Mutiplication);

        Button_Division = new JButton("÷");
        Button_Division.setBackground(new Color(60, 60, 65));
        Button_Division.setForeground(new Color(0, 200, 255));
        Button_Division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "/");
            }
        });
        Button_Division.setToolTipText("Division Operation");
        Button_Division.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Division.setBounds(252, 51, 62, 49);
        ButtonsPanel.add(Button_Division);

        Button_Equal = new JButton("=");
        Button_Equal.setBackground(new Color(0, 120, 200)); // Blue
        Button_Equal.setForeground(Color.WHITE);
        Button_Equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String output = evaluator.evaluate(input);
                textField.setText(output);
            }
        });
        Button_Equal.setToolTipText("Equal To");
        Button_Equal.setFont(new Font("Verdana", Font.PLAIN, 18));
        Button_Equal.setFocusable(true);
        Button_Equal.setBounds(252, 251, 62, 49);
        ButtonsPanel.add(Button_Equal);

        Button_Factorial = new JButton("!");
        Button_Factorial.setBackground(new Color(60, 60, 65));
        Button_Factorial.setForeground(new Color(0, 200, 255));
        Button_Factorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "!");
            }
        });
        Button_Factorial.setToolTipText("Factorial of Number");
        Button_Factorial.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Factorial.setBounds(189, 51, 62, 49);
        ButtonsPanel.add(Button_Factorial);

        Button_Sin = new JButton("Sin");
        Button_Sin.setBackground(new Color(60, 60, 65));
        Button_Sin.setForeground(new Color(0, 200, 255));
        Button_Sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    
                textField.setText(textField.getText() + "sin");
            }
        });
        Button_Sin.setToolTipText("Sin Function");
        Button_Sin.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Sin.setBounds(1, 101, 62, 49);
        ButtonsPanel.add(Button_Sin);

        Button_Cos = new JButton("Cos");
        Button_Cos.setBackground(new Color(60, 60, 65));
        Button_Cos.setForeground(new Color(0, 200, 255));
        Button_Cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                textField.setText(textField.getText() + "cos");
            }
        });
        Button_Cos.setToolTipText("Cos Function");
        Button_Cos.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Cos.setBounds(1, 151, 62, 49);
        ButtonsPanel.add(Button_Cos);

        Button_Tan = new JButton("Tan");
        Button_Tan.setBackground(new Color(60, 60, 65));
        Button_Tan.setForeground(new Color(0, 200, 255));
        Button_Tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "tan");
            }
        });
        Button_Tan.setToolTipText("Tan Function");
        Button_Tan.setFont(new Font("Verdana", Font.PLAIN, 14));
        Button_Tan.setBounds(1, 201, 62, 49);
        ButtonsPanel.add(Button_Tan);

        Button_Log = new JButton("log");
        Button_Log.setBackground(new Color(60, 60, 65));
        Button_Log.setForeground(new Color(0, 200, 255));
        Button_Log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "log");
            }
        });
        Button_Log.setToolTipText("Log Function");
        Button_Log.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Log.setBounds(1, 51, 62, 49);
        ButtonsPanel.add(Button_Log);

        Button_Power = new JButton("^");
        Button_Power.setBackground(new Color(60, 60, 65));
        Button_Power.setForeground(new Color(0, 200, 255));
        Button_Power.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "^");
            }
        });
        Button_Power.setToolTipText("Power Function");
        Button_Power.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Power.setBounds(63, 251, 62, 49);
        ButtonsPanel.add(Button_Power);

        Button_Square = new JButton("<html>X<sup>2</sup></html");
        Button_Square.setBackground(new Color(60, 60, 65));
        Button_Square.setForeground(new Color(0, 200, 255));
        Button_Square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "^2");
            }
        });
        Button_Square.setToolTipText("Square of Number");
        Button_Square.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Square.setBounds(1, 251, 62, 49);
        ButtonsPanel.add(Button_Square);

        Button_Sqrt = new JButton("<html>√</html>");
        Button_Sqrt.setBackground(new Color(60, 60, 65));
        Button_Sqrt.setForeground(new Color(0, 200, 255));
        Button_Sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "√");
            }
        });
        Button_Sqrt.setToolTipText("SquareRoot of Number");
        Button_Sqrt.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Sqrt.setBounds(126, 1, 62, 49);
        ButtonsPanel.add(Button_Sqrt);

        Button_Delete = new JButton("DEL");
        Button_Delete.setBackground(new Color(200, 60, 60)); // Red
        Button_Delete.setForeground(Color.WHITE);
        Button_Delete.setToolTipText("Delete the digit");
        Button_Delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = textField.getText().length();
                int number = textField.getText().length() - 1;
                String store;

                if (length > 0) {
                    StringBuilder back = new StringBuilder(textField.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textField.setText(store);
                }
            }
        });
        Button_Delete.setFont(new Font("Verdana", Font.PLAIN, 14));
        Button_Delete.setBounds(189, 1, 62, 49);
        ButtonsPanel.add(Button_Delete);

        Button_Clear = new JButton("AC");
        Button_Clear.setBackground(new Color(200, 60, 60)); // Red
        Button_Clear.setForeground(Color.WHITE);
        Button_Clear.setToolTipText("Clear the Calculator");
        Button_Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        Button_Clear.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Clear.setBounds(252, 1, 62, 49);
        ButtonsPanel.add(Button_Clear);

        Button_Exit = new JButton("EXIT");
        Button_Exit.setBackground(new Color(200, 60, 60)); // Red
        Button_Exit.setForeground(Color.WHITE);
        Button_Exit.setToolTipText("Exit the Calculator");
        Button_Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        Button_Exit.setFont(new Font("Verdana", Font.PLAIN, 12));
        Button_Exit.setBounds(63, 1, 62, 49);
        ButtonsPanel.add(Button_Exit);

        Button_SBracket = new JButton("(");
        Button_SBracket.setBackground(new Color(60, 60, 65));
        Button_SBracket.setForeground(new Color(0, 200, 255));
        Button_SBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "(");
            }
        });
        Button_SBracket.setToolTipText("Left Parenthesis ");
        Button_SBracket.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_SBracket.setBounds(63, 51, 62, 49);
        ButtonsPanel.add(Button_SBracket);

        Button_EBracket = new JButton(")");
        Button_EBracket.setBackground(new Color(60, 60, 65));
        Button_EBracket.setForeground(new Color(0, 200, 255));
        Button_EBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ")");
            }
        });
        Button_EBracket.setToolTipText("Right Parenthesis");
        Button_EBracket.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_EBracket.setBounds(126, 51, 62, 49);
        ButtonsPanel.add(Button_EBracket);

        rdbtn_ON = new JRadioButton("ON");
        rdbtn_ON.setBackground(new Color(45, 45, 48));
        rdbtn_ON.setForeground(new Color(0, 200, 255));
        rdbtn_ON.setToolTipText("Turn ON the Calculator");
        rdbtn_ON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enablecomponents();
            }
        });
        buttonGroup.add(rdbtn_ON);
        rdbtn_ON.setSelected(true);
        rdbtn_ON.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtn_ON.setBounds(1, 26, 62, 24);
        ButtonsPanel.add(rdbtn_ON);

        rdbtn_OFF = new JRadioButton("OFF");
        rdbtn_OFF.setBackground(new Color(45, 45, 48));
        rdbtn_OFF.setForeground(new Color(0, 200, 255));
        rdbtn_OFF.setToolTipText("Turn OFF the Calculator");
        rdbtn_OFF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                disablecomponenents();
                textField.setText(null);
            }
        });
        buttonGroup.add(rdbtn_OFF);
        rdbtn_OFF.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtn_OFF.setBounds(1, 1, 62, 24);
        ButtonsPanel.add(rdbtn_OFF);
    }

    // [Rest of the methods remain exactly the same] 
    private void disablecomponenents() {
        textField.setEnabled(false);
        Button_0.setEnabled(false);
        Button_1.setEnabled(false);
        Button_2.setEnabled(false);
        Button_3.setEnabled(false);
        Button_4.setEnabled(false);
        Button_5.setEnabled(false);
        Button_6.setEnabled(false);
        Button_7.setEnabled(false);
        Button_8.setEnabled(false);
        Button_9.setEnabled(false);
        Button_dot.setEnabled(false);
        Button_Addition.setEnabled(false);
        Button_Subtraction.setEnabled(false);
        Button_Mutiplication.setEnabled(false);
        Button_Division.setEnabled(false);
        Button_Equal.setEnabled(false);
        Button_Sin.setEnabled(false);
        Button_Cos.setEnabled(false);
        Button_Tan.setEnabled(false);
        Button_Factorial.setEnabled(false);
        Button_Log.setEnabled(false);
        Button_Power.setEnabled(false);
        Button_Square.setEnabled(false);
        Button_Sqrt.setEnabled(false);
        Button_Delete.setEnabled(false);
        Button_Clear.setEnabled(false);
        Button_SBracket.setEnabled(false);
        Button_EBracket.setEnabled(false);
    }

    private void enablecomponents() {
        textField.setEnabled(true);
        Button_0.setEnabled(true);
        Button_1.setEnabled(true);
        Button_2.setEnabled(true);
        Button_3.setEnabled(true);
        Button_4.setEnabled(true);
        Button_5.setEnabled(true);
        Button_6.setEnabled(true);
        Button_7.setEnabled(true);
        Button_8.setEnabled(true);
        Button_9.setEnabled(true);
        Button_dot.setEnabled(true);
        Button_Addition.setEnabled(true);
        Button_Subtraction.setEnabled(true);
        Button_Mutiplication.setEnabled(true);
        Button_Division.setEnabled(true);
        Button_Equal.setEnabled(true);
        Button_Sin.setEnabled(true);
        Button_Cos.setEnabled(true);
        Button_Tan.setEnabled(true);
        Button_Factorial.setEnabled(true);
        Button_Log.setEnabled(true);
        Button_Power.setEnabled(true);
        Button_Square.setEnabled(true);
        Button_Sqrt.setEnabled(true);
        Button_Delete.setEnabled(true);
        Button_Clear.setEnabled(true);
        Button_SBracket.setEnabled(true);
        Button_EBracket.setEnabled(true);
    }

  
}