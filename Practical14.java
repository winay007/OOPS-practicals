package Practicals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical14 {
    JTextField txt1;

    Practical14() {
        JFrame frame = new JFrame("Practical 14");
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 400, 150);
        txt1 = new JTextField(30);
        txt1.setEditable(false);
        // txt1.setBounds(50,100, 200,100);
        txt1.setPreferredSize(new Dimension(100, 60));
        panel1.add(txt1);
        frame.add(panel1, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setBounds(0, 100, 400, 350);
        panel.setLayout(new GridLayout(4, 4, 10, 20));
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btnC = new JButton("C");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnEquals = new JButton("=");
        JButton btnDivide = new JButton("/");
        JButton btnProduct = new JButton("*");

        ActionListener action = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                System.out.println(ae.getActionCommand());
                if (ae.getActionCommand().equals("=")) {
                    double res = calculateResult(txt1.getText());
                    if (res != Integer.MAX_VALUE)
                        txt1.setText(Double.toString(res));
                } else if (ae.getActionCommand().equals("C")) {
                    txt1.setText("");
                } else {
                    txt1.setText(txt1.getText() + ae.getActionCommand().toString());
                }
            }
        };

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn0);
        panel.add(btnC);
        panel.add(btnProduct);
        panel.add(btnMinus);
        panel.add(btnPlus);
        panel.add(btnEquals);
        panel.add(btnDivide);

        for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                // System.out.println(button.getText());
                button.addActionListener(action);
            }
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    private double calculateResult(String text) {

        int operatorIndex = findOperatorIndex(text);

        if (operatorIndex == -1) {
            return Integer.MAX_VALUE;
        }

        String operand1String = text.substring(0, operatorIndex).trim();
        String operator = text.substring(operatorIndex, operatorIndex + 1);
        String operand2String = text.substring(operatorIndex + 1).trim();

        try {
            double operand1 = Double.parseDouble(operand1String);
            double operand2 = Double.parseDouble(operand2String);

            double result = evaluateExpression(operand1, operator, operand2);
            return result;
        } catch (NumberFormatException | ArithmeticException e) {
            return Integer.MAX_VALUE;
        }
    }

    private int findOperatorIndex(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                return i;
            }
        }
        return -1;
    }

    private double evaluateExpression(double operand1, String operator, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        new Practical14();
    }
}
