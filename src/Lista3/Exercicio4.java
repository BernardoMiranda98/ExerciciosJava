/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista3;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main (String[] args){
     int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para n: "));
     
     if ((n == 2) || (n == 3) || (n == 5) || (n==7)){
         JOptionPane.showMessageDialog(null, "Primo");
         
     }else{
         if ((n % 2 == 0) || (n % 3 == 0)|| (n % 5 == 0) || (n % 7 == 0)){
         JOptionPane.showMessageDialog(null, "não Primo");
    }else {
              JOptionPane.showMessageDialog(null, "Primo");
         }
    }
    }
}