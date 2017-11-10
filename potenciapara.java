
import java.util.Scanner;
import javax.swing.JOptionPane;

public class potenciapara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int e1, e2, tl=1, i;
       
        e1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        e2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
        for(i=1;i<=e2;i++){
            tl=tl*e1;
        }
    JOptionPane.showMessageDialog(null,"El total de la potencia es: "+tl);
    }  
}
