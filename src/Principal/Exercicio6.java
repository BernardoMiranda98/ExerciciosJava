
package Principal;

import javax.swing.JOptionPane;

public class Exercicio6 {
public static void main (String[] args){
    
    int anos = Integer.parseInt(JOptionPane.showInputDialog("insira um valor para ano"));
    int meses = Integer.parseInt(JOptionPane.showInputDialog("insira um valor para meses"));
    int dias = Integer.parseInt(JOptionPane.showInputDialog("insira um valor para dias"));
    int viveu = (anos * 365) + (meses * 30) + dias;
    
    JOptionPane.showMessageDialog(null, "parabens você viveu :" + viveu + " dias");
}    
}
