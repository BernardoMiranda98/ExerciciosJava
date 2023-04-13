
package Lista3;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String[] args){
        int n, i;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para n: "));
        i = 1;
        
        while (i <=  n * 2){           
                JOptionPane.showMessageDialog(null, i);
                i+= 2;
                
            }           
        }
    }
