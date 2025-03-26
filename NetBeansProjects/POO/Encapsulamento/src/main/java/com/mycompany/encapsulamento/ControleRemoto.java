package com.mycompany.encapsulamento;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("ligando a tv");
    }

    @Override
    public void desligar() {
        System.out.println("desligando a tv");
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            
            System.out.println("------------------MENU------------------");
            System.out.println("Está ligado?: " + this.isLigado());
            System.out.println("Está tocando?: " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());

            for(int i=0; i < this.getVolume(); i+=10){
                System.out.print("|");
            }
            
        }else{
            System.out.println("não é possível abrir o menu, ligue a tv antes");
        }
      
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
       if(this.isLigado()){
           this.setVolume(this.getVolume() + 10);
       }else{
           System.out.println("Não é possível aumentar o volume");
       }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 10);
        }else{
            System.out.println("Não é possível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("ligando o mudo");
        }else{
            System.out.println("Não é possível ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
       if(this.isLigado() && this.getVolume() == 0){
           this.setVolume(30);
           System.out.println("desligando o mudo");
       }else{
           System.out.println("Não é possível desligar o mudo");
       }
    }

    @Override
    public void play() {
       if(this.isLigado() && !(this.isTocando())){
           this.setTocando(true);
           System.out.println("apertando o play...");
       }else{
           System.out.println("antes é preciso ligar a tv");
       }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("apertando o pause...");
        }else{
             System.out.println("antes é preciso ligar a tv");
        }
    }
    
    
    
    
}
