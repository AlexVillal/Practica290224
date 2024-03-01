/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora2;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Calculadora2 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el num 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el num 2"));
        
       Operaciones2 op=new Operaciones2();
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        op.mostrarResultados();
    }
}
