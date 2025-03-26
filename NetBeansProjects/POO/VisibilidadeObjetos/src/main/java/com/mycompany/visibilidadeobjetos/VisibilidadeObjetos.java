
package com.mycompany.visibilidadeobjetos;
public class VisibilidadeObjetos {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic cristal", "Azul", 0.5f, 90, true);
        /*c1.setModelo("bic cristal");
        c1.setCor("azul");
        c1.setPonta(0.5f);
        c1.setCarga(90);
        c1.setTampada(false);*/
        System.out.println(c1.getModelo());
        c1.status();
        
    }
}
