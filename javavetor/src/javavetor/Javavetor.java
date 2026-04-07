/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor;
import java.util.Scanner;

/*
 *
 * @author aluno
 */
public class Javavetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escreva o valor de x");
        int n = sc.nextInt();
        
        int[]X = new int[n];
        int[]Y = new int[n];
        for (int i = 0; i < n; i ++); {
        System.out.println("Digite o elemento" + (n + 1) + ":");
        X[n] = sc.nextInt();}
        for (int i = 0; i < n; i ++); {
    Y[n] = X [n - 1 - n];
    }
         System.out.print("\nVetor X: ");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }

        // Exibe o vetor Y
        System.out.print("\nVetor Y (invertido): ");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
        }

        sc.close();
    }
}
        
        
        
        // TODO code application logic here
    
    

