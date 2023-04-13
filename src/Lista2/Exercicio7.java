package Lista2;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?"));
        imc = peso / (altura * altura);

        if (imc < 16) {
            JOptionPane.showMessageDialog(null, "desnutrição grau 3");
        }
        if ((imc >= 16) && (imc <= 16.9)) {
            JOptionPane.showMessageDialog(null, "desnutrição grau 2");
        }
        if ((imc >= 17) && (imc <= 18.4)) {
            JOptionPane.showMessageDialog(null, "desnutrição grau 1");
        }
        if (imc >40){
            JOptionPane.showMessageDialog(null, "obesidade grau 3");
        }
    }
    

}
