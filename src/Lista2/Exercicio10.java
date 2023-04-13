
package Lista2;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main (String[] args){
        
        int par = 0;
        int impar = 0;
        
        for (int i=0; i<5; i++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Insira 5 valores distintos: "));
        
        if ((n %2)==0){
        par ++;
        }else{    
            impar++;
        }
           JOptionPane.showMessageDialog(null,par + " pares " + impar + " impares.");
    }
    }
}