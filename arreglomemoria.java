
public class arreglomemoria {
public static void main(String[] arg){
    int x[];
    x = new int[10];
    x[0] = 10;
    x[9] = 9;
    for(int i=0;i<=x.length;i++){
        System.out.println("arreglo en indice: "+i+" es igual a: " +x[i]);
    }
    int m[] = {1,2,3,4,5,6,7,8,90,12};
    for(int h=0;h<=m.length;h++){
        System.out.println("arreglo en indice: "+h+" es igual a: " +m[h]);
    }
}    
}
