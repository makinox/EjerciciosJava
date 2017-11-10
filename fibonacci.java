
public class fibonacci {
    public static void main(String[] arg){
        int x = 1, anterior = 0, temp;
        while(true){
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            if(x > 300){
                break;
            }
        }
    }
}
