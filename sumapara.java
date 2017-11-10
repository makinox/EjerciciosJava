
import java.util.Scanner;
import javax.swing.JOptionPane;


public class sumapara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int s=0;
        int i;
        for(i=100;i>=0;i=i-2){
            s=s+i;
        }
            JOptionPane.showMessageDialog(null,"El total de la suma es: "+s);          
    }  
}
