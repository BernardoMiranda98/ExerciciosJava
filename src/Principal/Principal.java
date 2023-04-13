
package Principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int lado;
        int área;
        int perimetro;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o lado"));
        perimetro = lado * 4;
        área = lado * lado;

        JOptionPane.showMessageDialog(null,"Perimetro: " + perimetro + "\nÁrea: " + área);
    }

}
