
package Principal;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String [] args){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("O valor de x é? " ));
        JOptionPane.showMessageDialog(null, "O valor de x é: " + x);
    }
}
