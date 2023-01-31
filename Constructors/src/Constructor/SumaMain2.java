package Constructor;

import javax.swing.*;

public class SumaMain2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 2"));
        Empleado empleado = new Empleado(n1,n2);
        JOptionPane.showMessageDialog(null,"La suma es: "+empleado.sumar());
    }
}
