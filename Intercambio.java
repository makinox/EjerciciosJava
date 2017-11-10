
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Intercambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int cambios = 0, a = 0, b = 0, c = 0, temp, i;
        for (i=0;i<=4;i++){
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese a"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese b"));
            c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese c"));
            if(a>c){
                temp=a;
                a=c;
                c=temp;
                JOptionPane.showMessageDialog(null,"Es: " +a);
                JOptionPane.showMessageDialog(null,"Es: " +b);
                JOptionPane.showMessageDialog(null,"Es: " +c);
                cambios=cambios+1;
                break;
            }else{
                if(b>c){
                    temp=b;
                    b=c;
                    c=temp;
                    JOptionPane.showMessageDialog(null,"Es: " +a);
                    JOptionPane.showMessageDialog(null,"Es: " +b);
                    JOptionPane.showMessageDialog(null,"Es: " +c);
                    cambios=cambios+1;
                    break;
                }
            }
        }
                JOptionPane.showMessageDialog(null,"Es: " +a);
                JOptionPane.showMessageDialog(null,"Es: " +b);
                JOptionPane.showMessageDialog(null,"Es: " +c);
                JOptionPane.showMessageDialog(null,"Las variables se intercambiaron: " +cambios +"veces");
    }
}
// dicta cuantas veces la variable cambio de posicion