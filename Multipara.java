
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Multipara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i, j, k;
        for (i=1;i<=3;i++){
            for (j=1;j<=3;j++){
                for (k=1;k<=3;k++){
                    JOptionPane.showMessageDialog(null,"Son: " +i +" " +j +" " +k);
                }
            }
        }
    }
}
// van las variables van aumentando de izquierda a deracha