package Ejercicio1;

import Ejercicio1.Operaciones.Operacion;
import Ejercicio1.Operaciones.OperacionFactory;

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
    private JScrollPane jspResultado;
    private JTextArea resultados;
    private float n1;
    private float n2;
    private float n3 = 0;
    private Operacion operacion;

    public Calculadora() {
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(txtnum1.getText());
                n2 = Integer.parseInt(txtnum2.getText());

                operacion= OperacionFactory.getOperacion(1);
                n3=operacion.realizarOperacion(n1,n2);
                resultados.append("Total = " + n3 + "\n");
            }
        });

        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(txtnum1.getText());
                n2 = Integer.parseInt(txtnum2.getText());

                operacion= OperacionFactory.getOperacion(2);
                n3=operacion.realizarOperacion(n1,n2);
                resultados.append("Total =" + n3 + "\n");
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(txtnum1.getText());
                n2 = Integer.parseInt(txtnum2.getText());

                operacion= OperacionFactory.getOperacion(3);
                n3=operacion.realizarOperacion(n1,n2);
                resultados.append("Total = " + n3 + "\n");
            }
        });


        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(txtnum1.getText());
                n2 = Integer.parseInt(txtnum2.getText());

                operacion= OperacionFactory.getOperacion(4);
                n3=operacion.realizarOperacion(n1,n2);
                resultados.append("Total =" + n3 + "\n");
            }
        });
        }
        public JPanel getPanel() {
            return panelMain;
    }

}
