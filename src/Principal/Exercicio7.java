
package Principal;

import javax.swing.JOptionPane;

public class Exercicio7 {
    
    public static void main (String[] args){
        
        double salariominimo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salario minimo atual?"));
        double salario = Double.parseDouble (JOptionPane.showInputDialog("Qual o valor do seu salario?"));
        
        double total = salario / salariominimo;
        
        
        JOptionPane.showMessageDialog(null,"A quantidade de salarios minimos que você recebe é: " + total);
        
       
        
        
    }
    
    
}
