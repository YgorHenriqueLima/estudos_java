package com.mycompany.estruturaderepeticao1;
import java.util.Scanner;
public class EstruturaDeRepeticao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int opcao = 0;
        while (opcao != 5){
            System.out.println("escolha uma das opções de operação matemática: \n "
                + "[1]Soma \n "
                + "[2]Subtração \n "
                + "[3]Multiplicação\n "
                + "[4]Divisão \n "
                + "[5]Sair");
        
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            
           
            if(opcao == 1){
                System.out.print("Primeiro valor: ");
                float n1 = teclado.nextFloat();

                System.out.print("Segundo Valor: ");
                float n2 = teclado.nextFloat();

                float soma = n1 + n2;
                System.out.println("A soma entre "+n1+" e "+n2+" é "+soma);
            }
            
            if(opcao == 2){
                System.out.print("Primeiro valor: ");
                float n1 = teclado.nextFloat();

                System.out.print("Segundo Valor: ");
                float n2 = teclado.nextFloat();
                
                float subtracao = n1 - n2;
                System.out.println("A subtração entre "+n1+" e "+n2+" é "+subtracao);
            }
            
            if(opcao == 3){
                System.out.print("Primeiro valor: ");
                float n1 = teclado.nextFloat();

                System.out.print("Segundo Valor: ");
                float n2 = teclado.nextFloat();
                
                float multiplicacao = n1 * n2;
                System.out.println("A multiplicação entre "+n1+" e "+n2+" é "+multiplicacao);
            }
            
            if(opcao == 4){
                System.out.print("Primeiro valor: ");
                float n1 = teclado.nextFloat();

                System.out.print("Segundo Valor: ");
                float n2 = teclado.nextFloat();
                
                float divisao = n1 / n2;
                System.out.println("A divisão entre "+n1+" e "+n2+" é "+divisao);
            }
            if(opcao == 5){
                break;
            }
        }
        
    }
}
