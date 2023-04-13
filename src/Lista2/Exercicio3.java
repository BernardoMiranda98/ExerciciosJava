package Lista2;

import javax.swing.JOptionPane;

public class Exercicio3 {
 
    public static void main (String[] args ){
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para x: "));
        
        if ((x % 5 == 0) && (x % 3 == 0)){
        JOptionPane.showMessageDialog(null, "DIVISIVEL");
            
    }else{
            JOptionPane.showMessageDialog(null, "NÃO É DIVISIVEL");
        }
    }
   
}
