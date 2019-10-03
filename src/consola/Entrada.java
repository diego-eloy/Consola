package consola;
import java.util.Calendar;
import java.util.Scanner;
public class Entrada {
    
    public static void main(String[] args) {
        
        System.out.println("\tEsto es un salto de linea \n ");
        String nombre = "Diego";
        int edad = 17;
        System.out.println("Hola mi nombre es "+nombre+" y tengo "+edad+"años");
        
        System.out.printf("Mi nombre es %s y tengo %d años\n",nombre,edad);
        
        Scanner sc = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        int ano=calendario.get(Calendar.YEAR);
        int hora=calendario.get(Calendar.HOUR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        
        System.out.printf("Hola soy %s y tengo &d",nombre,edad);
        System.out.printf("hoy es dia %d del %s del %d y son las %s",dia,mes,ano,hora);
                
        
    }
    
    
    
    
}
