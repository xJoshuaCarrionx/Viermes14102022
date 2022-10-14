package Class;

public class Excepciones {

	public static void main(String[] args) {
		// Dividir dos numeros
        int x = 48;
        int y = 0;
        System.out.println(DividirSinExcepciones(x, y));
        System.out.println(DividirconExcepciones(x, y));
        System.out.println(Dividir(x, y));
	}
     
	private static int DividirSinExcepciones(int x, int y){
		if(y != 0) {
			return x/y;
		}else {
			return 0;
		}
		
	}
	
	private static int DividirconExcepciones(int x, int y) {
		try {
			return x/y;
		}catch(ArithmeticException ex) {
			return 0;
		}
		
	}
    private static int Dividir(int x, int y){
    return x / y;
    
    }
}
