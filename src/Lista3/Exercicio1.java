
package Lista3;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main (String[] args){
        int n, i, fatorial;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("De um valor para n: "));
        fatorial = 1;
        i = n;
        
        while (i>0){
            fatorial = fatorial * i;
            i--;
            
            
        }
        JOptionPane.showMessageDialog(null,"Fatorial para: " + n + " Equivale a: " + fatorial);
    }
}
