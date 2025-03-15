package com.mycompany.exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita {

    public static void main(String[] args) {
        int n, soma_valores=0;
        int total_valores = 0;
        int total_pares = 0;
        int total_impares = 0;
        int tot_100 = 0;
        double media_valores = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>informe um número <em>(valor 0 interrompe)</em></html>"));
           
            if (n != 0){
                total_valores++;
                soma_valores += n;
                
                if(n%2 == 0){ /*É PAR*/
                    total_pares++;
                }

                if(n%2 == 1){ /*é ÍMPAR*/
                    total_impares++;
                }
                
                if (n > 100){ /*VALORES ACIMA DE 100*/
                    tot_100++;
                }
                
                if(total_valores > 0){
                    media_valores = soma_valores / total_valores;
                }else{
                    media_valores = 0;
                }
                
            
            }
            
        }while(n != 0);
        
        JOptionPane.showMessageDialog(null,"<html>RESULTADO: <hr>"
                + "SOMA DOS VALORES: "+soma_valores+  "<br>"
                + "TOTAL DE VALORES: "+total_valores+ "<br>"
                + "TOTAL DE PARES:   "+total_pares+   "<br>"
                + "TOTAL DE ÍMPARES: "+total_impares+ "<br>"
                + "ACIMA DE 100:     "+tot_100+       "<br>"
                + "MÉDIA DOS VALORES: "+media_valores+"</html>"
        );
    }
}
