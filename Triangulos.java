
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int l1 = 0, l2 = 0, l3 = 0;
        double t1, t2, t3;
        l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado 1"));
        l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado 2"));
        l3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado 3"));
        if ((l1==l2) && (l1==l3)){
            JOptionPane.showMessageDialog(null,"El triangulo es equilatero");
        }else{
            if((l1!=l2) && (l1!=l3)){
                JOptionPane.showMessageDialog(null,"El triangulo es escaleno");
            }else{
                JOptionPane.showMessageDialog(null,"El triangulo es isoseles");
            }
        
    }
    }
}
