
import java.util.Scanner;

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si el 
primer número es múltiplo del segundo, sino informe que no lo son.
 */

public class eje12 {

    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
      System.out.println("Ingrese un numero");
       int num= read.nextInt();
      System.out.println("Ingrese un segundo numero");
        int num2= read.nextInt(); 
      
        multiplo(num,num2);
        
        
    }
    public static void multiplo(int num, int num2) {
    
        float multiplo;
        multiplo = num % num2;
        
        if (multiplo == 0){
        System.out.println(num + " es multiplo de " + num2);
        }else{
        System.out.println(num + " NO es multiplo de " + num2);
        }
    }
}
    
