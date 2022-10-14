package Class;

import java.util.Scanner;
import java.

public class Otroejemploexcepciones {

	public static void main(String[] args) {
		int  x = leerEntero();
		int y = LeerEnterosConExcepciones();
		System.out.println("x = " + x);		

	}
    private static int leerEntero() {
    	Scanner lector = new Scanner(System.in);
    	System.out.println("Ingrese su numero;");
    	return lector.nextInt();
    }
    private static int LeerEnterosSinExcepciones() {
    	Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        String entrada = lector.next();
        boolean esEntero = true;
        for(int i = 0; i < entrada.length(); i++) {
        	if (!Character.isDigit(entrada.charAt(i))) {
        		esEntero = false;
        		break;
        	}
        	
        }
        if (esEntero) {
        	return Integer.parseInt(entrada);
        }
        return 0;
    }
    private static int LeerEnterosConExcepciones() {
    	Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        try {
        	return lector.nextInt();
        	
        }catch(Exception e) {
        	return 0;
        	
        }
    	
    }

}
 
