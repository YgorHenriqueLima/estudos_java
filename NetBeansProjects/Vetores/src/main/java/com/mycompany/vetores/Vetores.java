package com.mycompany.vetores;

import java.util.Scanner;
import java.time.Year;

        
public class Vetores {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu ano: ");
        int ano = teclado.nextInt();
        
        if(Year.of(ano).isLeap()){
            tot[1] = 29;
        }
        
        for(int i = 0; i < tot.length; i++) {
            System.out.println(mes[i] + " tem " + tot[i] + " dias");
        }
    }
}
