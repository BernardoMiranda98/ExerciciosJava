
package Principal;

import javax.swing.JOptionPane;


public class Exercicio8 {
    public static void main(String[] args){
        
        double conta = Double.parseDouble(JOptionPane.showInputDialog("Insira valor de conta bancaria:"));
        
        double reajuste = conta + (conta * 0.01);
        
        
        JOptionPane.showMessageDialog(null,"O valor é de: " + reajuste);
        
    }
}
