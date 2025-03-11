package com.mycompany.condicoesswitch;

import java.util.Scanner;

public class CondicoesSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("quantas pernas tem a criatura?: ");
        int pernas = teclado.nextInt();
        
        System.out.print("isso é um(a) ");
        String tipo;
        switch(pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.print(tipo);
    }
}
