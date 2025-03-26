package com.mycompany.encapsulamento;
public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.abrirMenu();
        c.play();
        c.maisVolume();
        c.abrirMenu();
    }
}
