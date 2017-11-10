
import java.util.Scanner;
import javax.swing.JOptionPane;

public class identificaciondenumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i, j = 1, k;
        for (i=0;i<=10;i++){
            j=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nimero" +i));
            
        }
        JOptionPane.showMessageDialog(null, "el valor es" +j);
    }    
}
