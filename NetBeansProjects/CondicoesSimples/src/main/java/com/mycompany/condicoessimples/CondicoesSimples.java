package com.mycompany.condicoessimples;

import java.util.Scanner;
public class CondicoesSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2;
        
        System.out.print("Digite a Primeira Nota: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Digite a Segunda Nota: ");
        n2 = entrada.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        // Melhorando a formatação da saída
        System.out.println("O aluno com as notas " + n1 + " e " + n2 + " tirou a média " + media);
        
        entrada.close(); // Fechar o scanner para evitar vazamento de recursos
        if(media >= 6){
            System.out.println("parabéns, você foi aprovado");
        }else if (media >= 5 && media < 6){
            System.out.println("você está em recuperação, boa sorte!");
        }else{
            System.out.println("você infelizmente está reprovado, tente da próxima vez");
        }
    }
}
