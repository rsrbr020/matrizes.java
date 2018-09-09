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
import java.util.Scanner;
public class Matrizes {

    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int matriz[][]=new int[5][3];
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C]=1;
                
            }
            
        }
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                System.out.print(matriz[L][C]+"\t");
                
            }
            System.out.println(""); 
        }
    }
 
    
}
