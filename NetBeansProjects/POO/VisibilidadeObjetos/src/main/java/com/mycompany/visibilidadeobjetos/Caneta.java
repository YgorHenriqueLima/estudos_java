package com.mycompany.visibilidadeobjetos;
public class Caneta {
    private String modelo;
    public String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
        
    }
    
                                
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
        
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int c){
        this.carga = c;
    }
    
    public boolean isTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else{
            System.out.println("RABISCA");
        }    
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("modelo da caneta: " + this.modelo);
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("ponta da caneta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada?: " + this.tampada);
    }
}
