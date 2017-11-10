
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Volumenes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int l1, a1, vol;
        double v1 = 0, r1;
        vol=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la figura deseada\n1.cubo\n2.esfera\n3.cono\n4.cilindro"));
        switch (vol){
            case 1:
                l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de una de sus aristas"));
                v1=l1^3;
                break;
            case 2:
                r1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio de la esfera"));
                v1=(4/3)*3.1415*(r1*r1*r1);
                break;
            case 3:
                r1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio del cono"));
                v1=3.1416*(r1*r1);
                break;
            case 4:
                a1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura del cilindro"));
                r1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio del cilindro"));
                v1=a1*3.1416*(r1*r1);
                break;
                default: JOptionPane.showMessageDialog(null,"NO DISPONIBLE");
                
                
                
        }
   JOptionPane.showMessageDialog(null,"El volumen de la figura es: " +v1);            
    }
}    
        
        