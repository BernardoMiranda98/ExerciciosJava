
package Lista2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para x: "));
        
        if ((x % 3 )==0){
            JOptionPane.showMessageDialog(null, "DIVISIVEL");
            
        }else{
            JOptionPane.showMessageDialog(null, "não é divisivel");
        }
    }
}
