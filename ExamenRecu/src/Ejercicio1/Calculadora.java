package Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JButton sumar;
    private JButton restar;
    private JButton multiplicar;
    private JButton dividir;
    private JLabel num1;
    private JLabel num2;
    private JPanel panelMain;
    private JTextArea resultados;
    private float n1;
    private float n2;
    private float n3=0;

    public Calculadora(){
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Integer.parseInt(txtnum1.getText());
                n2=Integer.parseInt(txtnum2.getText());

                resultados.setText(n1+ " + " + n2 + " = " + (n1 + n2));
                n3 = n3 + (n1 + n2);
                resultados.append("Total = " + n3 + "");
);
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 =Integer.parseInt(txtnum1.getText());
                n2 =Integer.parseInt(txtnum2.getText());

                resultados.setText((n1+ " + " + n2 + " = " + (n1 * n2));
                n3 = n3 + (n1 * n2);
                resultados.append("Total = " + n3 + "");
            }
        });
                restar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        n1 =Integer.parseInt(txtnum1.getText());
                        n2 =Integer.parseInt(txtnum2.getText());

                        resultados.setText(n1 + "-" + n2 + "=" +(n1-n2));
                        n3=n3 + (n1-n2);
                        resultados.append("Total =" + n3 + "");
                    }
                });

                dividir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        n1 =Integer.parseInt(txtnum1.getText());
                        n2 =Integer.parseInt(txtnum2.getText());
                    }
                });
    }
}
