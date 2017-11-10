/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Bolita {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int fig, l1;
        double r;
        fig=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operación deseada\n1.Blanca\n2.Verde\n3.Amarilla\n4.Azul\n5.Rojo"));
        l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de la compra"));
        switch (fig){
            case 1:
                r=l1;
                JOptionPane.showMessageDialog(null,"Total a pagar"+r);
                break;
            case 2:
                r=(l1-(l1*0.10));
                JOptionPane.showMessageDialog(null,"Total a pagar"+r);
                break;
            case 3:
                r=(l1-(l1*0.25));
                JOptionPane.showMessageDialog(null,"Total a pagar"+r);
                break;
            case 4: 
                r=(l1-(l1*0.50));
                JOptionPane.showMessageDialog(null,"Total a pagar"+r);
                break;
            case 5:
                r=l1-(l1*1);
                JOptionPane.showMessageDialog(null,"Total a pagar"+r);
                break;
            default: JOptionPane.showMessageDialog(null,"NO DISPONIBLE");
        
                        
                            
                        
        }
        }
}
