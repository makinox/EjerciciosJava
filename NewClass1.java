
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
public class NewClass1 {
    public static void main(String[] arg){
        int tPredio, sNombre, v1Predio, c1Predio, v1Comercial, c1Comercial, vuelta = 0, descuentos, temp15 = 0, tempr15 = 0, temp5 = 0, temp0 = 0 ;
        boolean jRecaudo;
        double predio,predio1 = 0, predio2 = 0, predio3 = 0, predio4 = 0, predio5 = 0, predio6 = 0, total = 0;
        jRecaudo = true;
        sNombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nombre"));
        JOptionPane.showMessageDialog(null, "Solo puede ingresar un maximo de 6 predios");
        while (jRecaudo = true){
            vuelta = vuelta + 1;
            tPredio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tipo de predio\n1.Residencial\n2.Comercial"));
            switch (tPredio){
                case 1: 
                    c1Predio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese codigo del predio"));
                    v1Predio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor del predio"));
                    descuentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese fecha de pago\n1.Primera fecha\n2.Segunda fecha\n3.despues"));
                       switch (descuentos){
                           case 1:
                               predio = v1Predio-(v1Predio*0.15);
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +v1Predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               tempr15 = tempr15 + 1;
                               break;
                           case 2:
                               predio = v1Predio-(v1Predio*0.5);
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               temp5 = temp5 + 1;
                               break;
                           case 3: 
                               predio = v1Predio;
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               break;
                       }
                       break;
                case 2:
                    c1Predio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese codigo del predio"));
                    v1Predio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor del predio"));
                    descuentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese fecha de pago\n1.Primera fecha\n2.Segunda fecha\n3.despues"));
                    switch (descuentos){
                           case 1:
                               predio = v1Predio-(v1Predio*0.15);
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +v1Predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               temp15 = temp15 + 1;
                               break;
                           case 2:
                               predio = v1Predio-(v1Predio*0.5);
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               temp5 = temp5 + 1;
                               break;
                           case 3: 
                               predio = v1Predio;
                               JOptionPane.showMessageDialog(null, "El valor total a pagar es: " +predio);
                               if (vuelta == 1){
                                   predio1 = predio;
                               }else if(vuelta == 2){
                                   predio2 = predio;
                               }else if(vuelta == 3){
                                   predio3 = predio;
                               }else if(vuelta == 4){
                                   predio4 = predio;
                               }else if(vuelta == 5){
                                   predio5 = predio;
                               }else if(vuelta == 6){
                                   predio6 = predio;
                               }
                               break;
            }
          
        }
            
    }
        total=predio1+predio2+predio3+predio4+predio5+predio6;
        JOptionPane.showMessageDialog(null, "Se obtuvieron " +tempr15 +" descuentos del 15% en predios de tipo comercial");
        JOptionPane.showMessageDialog(null, "El valor total de los predios es: " +total);
        JOptionPane.showMessageDialog(null, "El valor total de los predios comerciales es: " +totalCom);
        
    }
}
