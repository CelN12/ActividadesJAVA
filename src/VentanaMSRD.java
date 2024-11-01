
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMSRD extends JFrame{

    private JTextField campoNum1;
    private JTextField campoNum2;

    public VentanaMSRD(){
        setTitle("Operaciones Matemáticas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Etiquetas y campos de texto
        add(new JLabel("Número 1:"));
        campoNum1 = new JTextField();
        add(campoNum1);

        add(new JLabel("Número 2:"));
        campoNum2 = new JTextField();
        add(campoNum2);

        // Botón de Suma
        JButton botonSuma = new JButton("Suma");
        botonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("suma");
            }
        });
        add(botonSuma);

        // Botón de Resta
        JButton botonResta = new JButton("Resta");
        botonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("resta");
            }
        });
        add(botonResta);

        // Botón de Multiplicación
        JButton botonMultiplicacion = new JButton("Multiplicación");
        botonMultiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("multiplicacion");
            }
        });
        add(botonMultiplicacion);
    }
    private void realizarOperacion(String operacion) {
        try {
            double num1 = Double.parseDouble(campoNum1.getText());
            double num2 = Double.parseDouble(campoNum2.getText());
            double resultado = 0;

            switch (operacion) {
                case "suma":
                    resultado = num1 + num2;
                    break;
                case "resta":
                    resultado = num1 - num2;
                    break;
                case "multiplicacion":
                    resultado = num1 * num2;
                    break;
            }

            JOptionPane.showMessageDialog(this, "El resultado es: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
