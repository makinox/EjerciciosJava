
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Holacambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i, n;
        for(n = 2; n<=6; n++){
            for(i = 6; i>=4; i--){
                JOptionPane.showMessageDialog(null,"Es: " +n +" " +i);
                JOptionPane.showMessageDialog(null,"Hola ");
            }
        }
    }
}
// mientras que i baja su valor hasta alcanzar a n este cambia asi susesivamente hasta que n alcanza el 7, lo que se concluye es que n cambia de lugar a i 