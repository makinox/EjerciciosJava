
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Seguro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int e1, e2, n1, mol, col, r = 0;
        double rt = 0;
        e1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
        e2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar años con la licencia"));
        mol=Integer.parseInt(JOptionPane.showInputDialog("Escoger modelo del automovil\n1.A\n2.B"));
        switch (mol){
            case 1:
                col=Integer.parseInt(JOptionPane.showInputDialog("Escoger color del automovil\n1.Blanco\n2.Metalizado\n3.Otros"));
                switch (col){
                    case 1:
                        r=24041;
                        break;
                    case 2:
                        r=33000;
                        break;
                    case 3:
                        r=27050;
                        break;
                        
            }break;
            case 2:
                col=Integer.parseInt(JOptionPane.showInputDialog("Escoger color del automovil\n1.Blanco\n2.Metalizado\n3.Otros"));
                switch (col){
                    case 1:
                        r=30000;
                        break;
                    case 2:
                        r=36050;
                        break;
                    case 3:
                        r=33000;
                        break;
                  
        }
            break;    
            default: JOptionPane.showMessageDialog(null,"NO DISPONIBLE");
            
        
    }
    if(e1<=25){
        rt=r*1.25;
    }else{
        if ((e1<=30)&&(e1>=26)){
        rt=r*1.10;
        }else{
            if((e1<=65)&&(e1>=31)){
                rt=r;
            }else{
                if (e1>65){
                    rt=r*1.10;
                }
            }
    }
    }
if (e2<2){
    JOptionPane.showMessageDialog(null,"El total del seguro del señor es: " +rt*1.25);
}else{
    JOptionPane.showMessageDialog(null,"El total del seguro del señor es: " +rt);
}    
    }
}
