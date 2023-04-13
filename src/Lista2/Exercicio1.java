package Lista2;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main (String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
    
        if ((numero % 2)==0){
            JOptionPane.showMessageDialog(null, "é par!");
        }else{
            JOptionPane.showMessageDialog(null, "é impar!");
        }
    }
    
}
