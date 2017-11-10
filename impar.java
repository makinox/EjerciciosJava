
import javax.swing.JOptionPane;


public class impar {
    public static void main(String[] args){
        int i;
        for(i=0; i<=50;i++){
            if((i%2)!=0){
                //System.out.println(i);
                JOptionPane.showMessageDialog(null, "el valor es " +i);
            }
        }
    }
    
}
