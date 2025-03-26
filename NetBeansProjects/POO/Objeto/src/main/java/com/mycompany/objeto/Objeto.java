package com.mycompany.objeto;
public class Objeto {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 90;
        
        c1.rabiscar();
        c1.status();
    }
}
