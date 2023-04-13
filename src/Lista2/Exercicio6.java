package Lista2;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de c: "));

        // valor delta
        delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Esta equação não possui valores reais");
        }
        if (delta == 0) {

            x1 = (-b + (Math.sqrt(delta))) / (2 * a);

            JOptionPane.showMessageDialog(null, "A saida dessa equação é: " + x1);
        }
            if (delta > 0) {
                x1 = (-b + (Math.sqrt(delta))) / (2 * a);
                x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            if (x1 > x2){
                JOptionPane.showMessageDialog(null, "A raiz dessa equação é: " + x2 + " e " + x1);
                
            }else{
                JOptionPane.showMessageDialog(null, "A raiz dessa equação é: " + x1 + " e " + x2);
            }      
            
        }

    }
}
