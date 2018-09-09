/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

/**
 *
 * @author Rafael Sousa Ribeiro
 */
import java.util.Random;
import java.util.Scanner;
public class Matrizes {

    public static void main(String[] args) {
        Random aleatorio= new Random();
        Scanner tcl = new Scanner(System.in);
        int matriz[][]=new int[5][3];
        boolean encontrado =  false;
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C]= aleatorio.nextInt(10);
                
            }
            
        }
        System.out.println("Digite um valor para ser encontrado!!!!");
        int valor = tcl.nextInt();
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                System.out.print("");
                if(valor == matriz[L][C]){
                    System.out.println("Valor encontrado na posiçao" + matriz[L][C]);
                    encontrado = true;
                    break;
                }
                
            }
            
        }
        if(encontrado == false){
            System.out.println("Valor nao encontrado");
        }
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                System.out.print(matriz[L][C]+"\t");
                
            }
            System.out.println(""); 
        }

    }
}