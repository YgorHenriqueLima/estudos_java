package com.mycompany.vetor03;

import java.util.Arrays;
public class Vetor03 {
    public static void main(String[] args) {
        int v[] = {1,3,5,2,9,6,7};
        
        int p = Arrays.binarySearch(v, 3);
        System.out.println("encontrei o valor da posição"+p);
        
        Arrays.sort(v);
        
        for(int valor:v){
            System.out.print(valor + " ");
        }
    }
}
