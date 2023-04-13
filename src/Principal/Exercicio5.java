package Principal;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
        int segundosuser = Integer.parseInt(JOptionPane.showInputDialog("insira um valor em segundos"));
        int dias = segundosuser / 86400;
        int diasresto= segundosuser % 86400;
                
        int horas =  diasresto / 3600;
        int horasresto=diasresto%3600;
         
        int minutos = horasresto / 60;
        int segundos = horasresto % 60;
        
        JOptionPane.showMessageDialog(null, dias + " Dias" + horas + "Horas " + minutos + "Minutos"
        + segundos + "segundos");

    }
}
