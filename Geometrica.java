import java.util.Scanner;
import javax.swing.JOptionPane;


public class Geometrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int fig, l1, l2, l3, l4, r;
        fig=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operación deseada\n1.Cuadrado\n2.Triangulo\n3.Rectangulo\n4.Circulo"));
        switch (fig){
            case 1:
            l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer valor"));
            r=l1*4;
            JOptionPane.showMessageDialog(null,"El perimetro es: "+r);
            break;
            case 2:
            l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer valor"));
            l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo valor"));
            l3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer valor"));
            r=l1+l2+l3;
            JOptionPane.showMessageDialog(null,"El perimetro es: "+r);
            break;
            case 3:
            l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer valor"));
            l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo valor"));
            r=(l1*2)+(l2*2);
            JOptionPane.showMessageDialog(null,"El perimetro es: "+r);
            break;
            case 4:
            l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese radio valor"));
            r=(int) (2*(3.1416)*l1);
            JOptionPane.showMessageDialog(null,"El perimetro es: "+r);
            break;
            default: JOptionPane.showMessageDialog(null,"NO DISPONIBLE");
                    
        
        }
            
        
    }
}
