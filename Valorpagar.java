/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
import javax.swing.*;//Ventana
import java.util.Scanner;//Consola
public class Valorpagar {//Inicio de la clase
    public static void main(String args[]){//Inicio
        double vc,des,vp;//Declaracion de variables
        vc=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de compra"));//Escribir
        if (vc<100000){//Si
            des=vc*0.10;
            vp=vc-des;
            JOptionPane.showMessageDialog(null,"Valor a pagar"+vp);
        }else{
            if((vc>100000)&&(vc<200000)){
             des=vc*0.3;
             vp=vc-des;
             JOptionPane.showMessageDialog(null,"Valor a pagar"+vp);
            }else{
                des=vc*0.5;
                vp=vc-des;
                JOptionPane.showMessageDialog(null,"Valor a pagar"+vp);
            }
        }
    }//fin
    
}
