package com.mycompany.objeto;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else{
            System.out.println("RABISCA");
        }    
    }
    
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        System.out.println("modelo da caneta: " + this.modelo);
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("ponta da caneta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada?: " + this.tampada);
    }
    
}
