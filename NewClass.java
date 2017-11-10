
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantebq
 */
public class NewClass {
    public static void main(String[] arg){
        int a,b,x;
    
    a=Integer.parseInt(JOptionPane.showInputDialog(null, "a"));
    b=Integer.parseInt(JOptionPane.showInputDialog(null, "b"));
    x= a % b;
    JOptionPane.showMessageDialog(null, x);
    }
}
