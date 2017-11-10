
import java.util.Scanner;
import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1, f1 = 1, i;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a descubrir el factorial"));
                   for(i=1;i<=n1;i=i+1){
                   f1=f1*i;
            }
            JOptionPane.showMessageDialog(null,"El factorial es: " +f1);
        }   
}
