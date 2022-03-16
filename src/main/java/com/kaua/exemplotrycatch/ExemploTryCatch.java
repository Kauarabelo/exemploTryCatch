/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaua.exemplotrycatch;
import java.util.Scanner;

/**
 *
 * @author devsys-b
 */
public class ExemploTryCatch {
    public static void main(String[] args) {
        
        int [] valor = {10,20,30,40};
        boolean saida = true;
        Scanner teclado = new Scanner(System.in);
        
        do{
            try{
                System.out.println("\nDigite um valor: ");
                int a = teclado.nextInt();
                
                System.out.print(valor[a]);
                
                saida = false;
                
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.err.printf("%nErro: %s%n",arrayIndexOutOfBoundsException);
                System.out.printf("%n Valor de busca do array maior que o alocado");
                saida = false;

            }
        }while(saida);    
       
    }
    
}
