
package Lista2;
import javax.swing.JOptionPane;


public class Exercicio4 {
    public static void main (String[] args){
    int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para x: "));
    int y = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para y: "));
    int w = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para w: "));
    
    if ((x < y) && (y < w)){  
        JOptionPane.showMessageDialog(null, "É crescente ");
        
    }else{
        JOptionPane.showMessageDialog(null, "Decrescente");
    }
    
    }
    
}
