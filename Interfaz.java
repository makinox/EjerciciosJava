
public class Interfaz  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               new project4.Home4().setVisible(true);
               
            }
        };
        runnable.run();
    }
    
}
