
package Lista2;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main (String[] args){
        double produto;
        int pagamento;
        boolean flag;
        
        produto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto? "));
        pagamento = Integer.parseInt(JOptionPane.showInputDialog("1 - Á vista com 15% desconto"
                + "\n2 - crédito a vista com 10% desconto"
        + "\n3 - 2x sem juros"
        + "\n4 - preço normal + 3x com 10% de juros"));
        flag = false;
        
        if (pagamento ==1){
            JOptionPane.showMessageDialog(null,"Total a ser pago: R$" + (produto - (produto*0.15)) );
        }
        if (pagamento ==2){
        JOptionPane.showMessageDialog(null,"Total a ser pago: R$" + (produto - (produto*0.1)) );
        }
        if (pagamento ==3){
        JOptionPane.showMessageDialog(null,"Total a ser pago: R$ 10 \n2x de R$5" );
            
        }
         if (pagamento ==4){
             JOptionPane.showMessageDialog(null,"Total a ser pago: R$" + (produto + (produto * 0.1)) 
                     + "\n3x de R$" + (produto + produto * 0.1)/3 );
         }
        
        
        
//        avista =  produto - (produto*0.15);
//        avista2 = produto - (produto*0.1);
//        parcela = produto * 0.1;
        
        
            
        
    }
}
