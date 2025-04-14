package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JLabel resultado = new JLabel("Resultado:");

        Calculadora calc = new Calculadora();

        JButton suma = new JButton("Sumar");
        suma.addActionListener((ActionEvent e) -> {
            double res = calc.sumar(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText("Resultado: " + res);
        });

        JButton resta = new JButton("Restar");
        resta.addActionListener((ActionEvent e) -> {
            double res = calc.restar(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText("Resultado: " + res);
        });

        JButton mult = new JButton("Multiplicar");
        mult.addActionListener((ActionEvent e) -> {
            double res = calc.multiplicar(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText("Resultado: " + res);
        });

        JButton div = new JButton("Dividir");
        div.addActionListener((ActionEvent e) -> {
            try {
                double res = calc.dividir(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
                resultado.setText("Resultado: " + res);
            } catch (ArithmeticException ex) {
                resultado.setText("Error: " + ex.getMessage());
            }
        });

        panel.add(new JLabel("Número 1:"));
        panel.add(num1);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2);
        panel.add(suma);
        panel.add(resta);
        panel.add(mult);
        panel.add(div);
        panel.add(resultado);

        frame.add(panel);
        frame.setVisible(true);
    }
}
