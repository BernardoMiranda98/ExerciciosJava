package Lista2;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {

        double dxy;
        int x1= Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para x1: "));
        int y1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para y1: "));
        int x2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para x2: "));
        int y2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para y2: "));
        
        dxy = Math.sqrt(((x1 - x2)*(x1-x2)) + ((y1 - y2) * (y1 - y2)));
    
        if ( dxy >=10){
            JOptionPane.showMessageDialog(null,"LONGE" + dxy);
            
        }else{
            JOptionPane.showMessageDialog(null,"PERTO" + dxy);
        }
    }
}
