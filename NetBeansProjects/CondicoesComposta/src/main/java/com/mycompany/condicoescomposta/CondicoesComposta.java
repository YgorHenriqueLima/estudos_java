package com.mycompany.condicoescomposta;

import java.util.Scanner;
import java.time.Year;

public class CondicoesComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o seu nome: ");
        String nome = teclado.next();
        
        System.out.print("Informe seu ano de nascimento: ");
        int ano_nascimento = teclado.nextInt();
        
        int ano_atual = Year.now().getValue();
        int idade = ano_atual - ano_nascimento;
        
        System.out.print("olá " + nome + " você nasceu em " + ano_nascimento + " e sua idade em "+ano_atual+" é "+idade+" anos");
        
        if(idade >= 18){
            System.out.println(" e você é maior de idade");
        }else{
            System.out.println(" e você é menor de idade");
        }
    }
}
