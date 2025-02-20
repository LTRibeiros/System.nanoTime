import javax.swing.JOptionPane;
/*
 * Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
posições inteiras (Preencher todas as posições com valor 0) e gere o tempo gasto, em
Segundos, para percorrer o vetor. Repetir para 10000 e 100000 posições. A aplicação deve
ter uma classe de controle com métodos para operações e uma classe de visão que instancie
a classe de controle para a comunicação. A resposta da tarefa deve ser o print do console
com cada tempo.
 */

/**
 *
 * @author Particular
 */
public class NanoTime_Ex1 {
    public static void main (String args []) {
        
        Classe_Metodos x = new Classe_Metodos();
        
        
        int opc = 0;
        int tamanho;
        double tempo = 0;
        
        while (opc != 9) {
            
            opc = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do vetor" + "\n" + "1- 1.000 posições \n 2-10.000 posições \n 3-100.000 posições \n 9- Encerrar"));
        
            
            switch(opc) {
                
                case 1:
                    tamanho = 1000;
                    tempo = x.CalculaNanoTempo(tamanho);
                    System.out.println(tempo);
                    break;
                    
                case 2:
                    tamanho = 10000;
                    tempo = x.CalculaNanoTempo(tamanho);
                    System.out.println(tempo);
                    break;
                    
                case 3:
                    tamanho = 100000;
                    tempo = x.CalculaNanoTempo(tamanho);
                    System.out.println(tempo);
                    break;
                    
                case 9:
                    System.exit(0);
                    
                            
           }
        }
            
           
            
    }
         
       
         
             
         
         
        
    }

