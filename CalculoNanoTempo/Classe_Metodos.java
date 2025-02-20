/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class Classe_Metodos {
    public double CalculaNanoTempo(int tamanho){
        
        int Vetor[] = new int[tamanho];
            
            double tempoInicial = System.nanoTime();
            for (int i = 0 ; i < Vetor.length ; i ++) {
                Vetor[i] = 0;
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal / Math.pow(10, 9);
            
            
        
        return tempoTotal;
    }
}
