
import java.util.Scanner;
import javax.swing.JOptionPane;

public class promediopara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int h=0, ch=0, m=0, cm=0, ne, i, s, e, st = 0;
        ne=Integer.parseInt(JOptionPane.showInputDialog("Total de los alumnos del salon"));
        for(i=0;i<=ne;i++){
           s=Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 femenino, 2 masculino"));
           e=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
           if(s==2){
               h=h+e;
               ch=ch+1;
               
           }else{
               m=m+e;
               cm=cm+1;
           }
           st=h+m;
        }
        JOptionPane.showMessageDialog(null,"El promedio de edad de hombres es: "+h/ch);
        JOptionPane.showMessageDialog(null,"El promedio de edad de hombres es: "+m/cm);
        JOptionPane.showMessageDialog(null,"El promedio de edad de hombres es: "+st/ne);
}
}
