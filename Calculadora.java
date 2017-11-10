/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;//Ventana
import java.util.Scanner;//Consola

/**
 *
 * @author estudiante
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int fig, l1, l2, r;
        fig=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operación deseada\n1.Suma\n2.Restar\n3.Multiplicar\n4.Divicion"));
        l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer valor"));
        l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer valor"));
        switch (fig){
            case 1:
                r=l1+l2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+r);
                break;
            case 2:
                r=l1-l2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+r);
                break;
            case 3:
                r=l1*l2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+r);
                break;
            case 4:
                if (l2==0){
                JOptionPane.showMessageDialog(null,"Error ");   
            }else{ 
                    r=l1/l2;
                    JOptionPane.showMessageDialog(null,"El resultado es: "+r);
                    }
                break;
            default: JOptionPane.showMessageDialog(null,"NO DISPONIBLE");
                            
                
        }
        
                
                
        
    }

   
  
    
}
