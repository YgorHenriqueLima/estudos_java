package com.mycompany.operadoresaritmeticos;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        float n1,n2,media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("N1: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("n2: "));
        media = (n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "A média é igual a " + media);
    }
}
